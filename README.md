# Spring-boot-with-Mybatis
一个简单的Spring boot 加 Mybatis 整合Demo

注意事项：
1. 在测试项目中本地使用的Java版本是1.7，所以Spring boot的版本不能过高否则启动报错（如1.8以上版本无视）
2. 配置数据源时url的参数注意配置编码格式 添加后缀 ?useUnicode=true&characterEncoding=UTF-8 ，否则会出现中文存入数据库中显示为 ？？ 字符的情况
3. 映射文件基本namespace和dao文件相匹配
4. 在yml配置文件中 添加映射文件的目录看个人喜好,这里放在resource/mapper目录下所以写成 mapper-locations: classpath:mapper/*.xml
