# 1.5.0

## HIGHLIGHT

- 提供自定义 directive bean 的方式 [68](https://github.com/wangyuheng/Arc/issues/68)

### Graphql

- ENHANCEMENT: 增加graphql validation 扩展依赖 [70](https://github.com/wangyuheng/Arc/pull/70)

### Graphql Client

- BUGFIX: graphql-client发布后无法读取ql文件 [72](https://github.com/wangyuheng/Arc/issues/72)


# 1.4.0

## HIGHLIGHT

- 新增graphql-plugin模块，通过Maven插件封装代码生成功能 [51](https://github.com/wangyuheng/Arc/issues/51)

### Generator

- ENHANCEMENT: 代码生成时type model 提供builder模式 [49](https://github.com/wangyuheng/Arc/issues/49)
- ENHANCEMENT: GraphqlMethod同时生成field & setter & getter [65](https://github.com/wangyuheng/Arc/issues/65)
- BUGFIX: 代码生成器无参数方法不会生成graphqlMethod [61](https://github.com/wangyuheng/Arc/issues/61)
- BUGFIX: 生成代码在不同系统下格式不同 [46](https://github.com/wangyuheng/Arc/issues/46)
- BUGFIX: 代码生成器把Graphql Json生成为java String [54](https://github.com/wangyuheng/Arc/issues/54)

### Graphql Client

- ENHANCEMENT: 根据泛型type自动反序列化 [57](https://github.com/wangyuheng/Arc/issues/57)
- BUGFIX: 请求时服务端返回xml [56](https://github.com/wangyuheng/Arc/issues/56)


# 1.3.0

## HIGHLIGHT

- group修改为`io.github.wangyuheng`发布至Maven中央仓库 [#38](https://github.com/wangyuheng/Arc/issues/38)

### Generator

- @DataFetcherService 重命名为 @Graphql


# 1.2.0

## HIGHLIGHT

- 新增graphql-client模块，方便作为客户端调用其他Graphql服务 [#28](https://github.com/wangyuheng/Arc/issues/28)

### Generator

- BUGFIX: Windows系统下javadoc多生成一个换行 [#31](https://github.com/wangyuheng/Arc/issues/31)

### Graphql

- BUGFIX: 项目中使用@EnableFeignClients后Graphql方法注册失败，无法调用 [#27](https://github.com/wangyuheng/Arc/issues/27)
- ENHANCEMENT: 完善统一的异常处理 [#33](https://github.com/wangyuheng/Arc/issues/33)

### Dgraph 

- BUGFIX: Dgraph初始化并且drop-all时表结构丢失 [#13](https://github.com/wangyuheng/Arc/issues/13)
- BUGFIX: Dgraph结果解析不支持一个List内包含多种类型 [#22](https://github.com/wangyuheng/Arc/issues/22)
- BUGFIX: Dgraph的SimpleDgraphRepository提供的getOne无法使用 [#23](https://github.com/wangyuheng/Arc/issues/23)


# 1.1.0

## HIGHLIGHT

- 新增generator模块，用于代码生成 [#5](https://github.com/wangyuheng/Arc/issues/5)

### Common

- 移除lombok依赖 [#19](https://github.com/wangyuheng/Arc/issues/19)

### Generator

- 根据GraphqlSchema生成DgraphSchema [#10](https://github.com/wangyuheng/Arc/issues/10)
- 根据GraphqlSchema生成Java代码 [#5](https://github.com/wangyuheng/Arc/issues/5)

### Dgraph

- 通过配置初始化数据库Schema [#7](https://github.com/wangyuheng/Arc/issues/7)


# 1.0.0

### Graphql

- add embed playground
- add embed voyager
- graphql client 用于服务端之间Graphql调用
- graphql 自定义业务异常处理及http status
- graphql 通过domainClass自动解析union type 及interface
- 增加 payload 解析工具

### Dgraph

- dgraph 增加 interceptor 支持
- dgraph client 通过 properties 配置
- xml增加 mutation 方法定义及解析
- dgraph 提供relationship操作
- dgraph 增加RDF处理工具
- dgraph 自动增加变量前缀
- dgraph config bean 自动配置
- dgraph xml location 可配置
- relationship custom name
- modify search index
- 增加upsert方法

### mq

- 基于VM Queue实现
