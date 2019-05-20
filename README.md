- 新网code：EX-XW
- 众邦code：EX-ZB
- http://localhost:8080/auto-loan/buyBack/EX-ZB/a123
- http://localhost:8080/auto-loan/buyBack/EX-XW/a123

此模式为了解决代码中出现大量的 if-else-if 判断而生，通过spring.getBean(String name) 方式演化而来，文中列举了新网、众邦回购业务的场景

在声明新网回购Service和众邦回购Service时候，刻意的统一了Service的命名
```
@Service("xinwangBuyBack")
@Service("zhongbangBuyBack")
```
在Controller调用时，通过渠道名决定调用具体的Service
```
String beanId = capitals.get(capital) + "BuyBack";
IBuyBack buyBack = (IBuyBack) springUtils.getObject(beanId, IBuyBack.class);
return buyBack.buyBack(applyId);
```

当新增 | 删除渠道时，只需要维护 CapitalEnum 枚举，同时 新增 | 删除 com.leomii.switchcase.service 端代码即可，
保持调用段 Controller 独立，使得渠道的变更对代码的影响范围最小。

优点：
- 取消大量 if-else-if 判断分支
- 使得容易变动的渠道，对代码的影响范围可控

缺点：
- 通过 beanId 命名编排，决定调用逻辑
- 增加代码难度，需添加注意解释此模式

代码结构：
- controller：调用端，web入口
- enumration：资方枚举
- integration：资方调用继承
- service：本地业务逻辑编排
- util：常量表，spring bean utils
- Applicatoin：springboot 启动入口


备注：本代码经过 sonar、pmd 扫描