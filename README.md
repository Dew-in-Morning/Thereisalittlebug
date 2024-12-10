# Thereisalittlebug
救救，应该是个小bug但我从那里开始解决都没头绪
运行test启动就报错，说我提供的参数不对，需要空参，给了三个，但我已经用lombok的
“@Data
@NoArgsConstructor
@AllArgsConstructor”
注释了啊，应该有全参构造啊

报错信息如下：
“
E:\LEARNING\backend learning\ClassOfDataBase\ClassSet\src\main\java\com\lieyan\pojo\Result.java:17:16
java: 无法将类 com.lieyan.pojo.Result中的构造器 Result应用到给定类型;
  需要: 没有参数
  找到:    int,java.lang.String,<nulltype>
  原因: 实际参数列表和形式参数列表长度不同
E:\LEARNING\backend learning\ClassOfDataBase\ClassSet\src\main\java\com\lieyan\pojo\Result.java:21:16
java: 无法将类 com.lieyan.pojo.Result中的构造器 Result应用到给定类型;
  需要: 没有参数
  找到:    int,java.lang.String,java.lang.Object
  原因: 实际参数列表和形式参数列表长度不同
E:\LEARNING\backend learning\ClassOfDataBase\ClassSet\src\main\java\com\lieyan\pojo\Result.java:25:16
java: 无法将类 com.lieyan.pojo.Result中的构造器 Result应用到给定类型;
  需要: 没有参数
  找到:    int,java.lang.String,<nulltype>
  原因: 实际参数列表和形式参数列表长度不同
E:\LEARNING\backend learning\ClassOfDataBase\ClassSet\src\main\java\com\lieyan\pojo\Result.java:28:16
java: 无法将类 com.lieyan.pojo.Result中的构造器 Result应用到给定类型;
  需要: 没有参数
  找到:    int,java.lang.String,java.lang.Object
  原因: 实际参数列表和形式参数列表长度不同

”
