# mall

<p>
  <a href="#公眾號"><img src="http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/badge/%E5%85%AC%E4%BC%97%E5%8F%B7-macrozheng-blue.svg" alt="公眾號"></a>
  <a href="#公眾號"><img src="http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/badge/%E4%BA%A4%E6%B5%81-%E5%BE%AE%E4%BF%A1%E7%BE%A4-2BA245.svg" alt="交流"></a>
  <a href="https://github.com/macrozheng/mall-learning"><img src="http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/badge/%E5%AD%A6%E4%B9%A0%E6%95%99%E7%A8%8B-mall--learning-green.svg" alt="學習教程"></a>
  <a href="https://github.com/macrozheng/mall-swarm"><img src="http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/badge/Cloud%E7%89%88%E6%9C%AC-mall--swarm-brightgreen.svg" alt="SpringCloud版本"></a>
  <a href="https://github.com/macrozheng/mall-admin-web"><img src="http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/badge/%E5%89%8D%E7%AB%AF%E9%A1%B9%E7%9B%AE-mall--admin--web-green.svg" alt="前端項目"></a>
  <a href="https://gitee.com/macrozheng/mall"><img src="http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/badge/%E7%A0%81%E4%BA%91-%E9%A1%B9%E7%9B%AE%E5%9C%B0%E5%9D%80-orange.svg" alt="碼雲"></a>
</p>

## 友情提示

> 1. **快速體驗項目**：[在線訪問地址](http://www.macrozheng.com/admin/index.html)。
> 2. **全套學習教程**：[《mall學習教程》](http://www.macrozheng.com/#/README)。
> 3. **微服務版本**：基於Spring Cloud Hoxton & Alibaba的項目：[mall-swarm](https://github.com/macrozheng/mall-swarm)。
> 4. **專屬學習路線**：學習不走彎路，整理了套非常不錯的[《mall專屬學習路線》](#公眾號)。
> 5. **項目交流**：想要加群交流項目的朋友，可以加入[mall項目交流群](#公眾號)。

## 前言

`mall`項目致力於打造一個完整的電商系統，採用現階段流行技術實現。

## 項目文檔

- 文檔地址：[http://www.macrozheng.com](http://www.macrozheng.com)
- 備用地址：[https://macrozheng.github.io/mall-learning](https://macrozheng.github.io/mall-learning)

## 項目介紹

`mall`項目是一套電商系統，包括前臺商城系統及後臺管理系統，基於SpringBoot+MyBatis實現，採用Docker容器化部署。前臺商城系統包含首頁門戶、商品推薦、商品搜索、商品展示、購物車、訂單流程、會員中心、客戶服務、幫助中心等模塊。後臺管理系統包含商品管理、訂單管理、會員管理、促銷管理、運營管理、內容管理、統計報表、財務管理、權限管理、設置等模塊。

### 項目演示

#### 後臺管理系統

前端項目`mall-admin-web`地址：https://github.com/macrozheng/mall-admin-web

項目演示地址： [http://www.macrozheng.com/admin/index.html](http://www.macrozheng.com/admin/index.html)  

![後臺管理系統功能演示](http://img.macrozheng.com/mall/project/mall_admin_show.png)

#### 前臺商城系統

前端項目`mall-app-web`地址：敬請期待......

項目演示地址：[http://www.macrozheng.com/app/mainpage.html](http://www.macrozheng.com/app/mainpage.html)

![前臺商城系統功能演示](http://img.macrozheng.com/mall/project/mall_app_show.png)

### 組織結構

``` lua
mall
├── mall-common -- 工具類及通用代碼
├── mall-mbg -- MyBatisGenerator生成的數據庫操作代碼
├── mall-security -- SpringSecurity封裝公用模塊
├── mall-admin -- 後臺商城管理系統接口
├── mall-search -- 基於Elasticsearch的商品搜索系統
├── mall-portal -- 前臺商城系統接口
└── mall-demo -- 框架搭建時的測試代碼
```

### 技術選型

#### 後端技術

| 技術                 | 說明                | 官網                                           |
| -------------------- | ------------------- | ---------------------------------------------- |
| SpringBoot           | 容器+MVC框架        | https://spring.io/projects/spring-boot         |
| SpringSecurity       | 認證和授權框架      | https://spring.io/projects/spring-security     |
| MyBatis              | ORM框架             | http://www.mybatis.org/mybatis-3/zh/index.html |
| MyBatisGenerator     | 數據層代碼生成      | http://www.mybatis.org/generator/index.html    |
| Elasticsearch        | 搜索引擎            | https://github.com/elastic/elasticsearch       |
| RabbitMQ             | 消息隊列            | https://www.rabbitmq.com/                      |
| Redis                | 分佈式緩存          | https://redis.io/                              |
| MongoDB              | NoSql數據庫         | https://www.mongodb.com                        |
| LogStash             | 日誌收集工具        | https://github.com/elastic/logstash            |
| Kibina               | 日誌可視化查看工具  | https://github.com/elastic/kibana              |
| Nginx                | 靜態資源服務器      | https://www.nginx.com/                         |
| Docker               | 應用容器引擎        | https://www.docker.com                         |
| Jenkins              | 自動化部署工具      | https://github.com/jenkinsci/jenkins           |
| Druid                | 數據庫連接池        | https://github.com/alibaba/druid               |
| OSS                  | 對象存儲            | https://github.com/aliyun/aliyun-oss-java-sdk  |
| MinIO                | 對象存儲            | https://github.com/minio/minio                 |
| JWT                  | JWT登錄支持         | https://github.com/jwtk/jjwt                   |
| Lombok               | 簡化對象封裝工具    | https://github.com/rzwitserloot/lombok         |
| Hutool               | Java工具類庫        | https://github.com/looly/hutool                |
| PageHelper           | MyBatis物理分頁插件 | http://git.oschina.net/free/Mybatis_PageHelper |
| Swagger-UI           | 文檔生成工具        | https://github.com/swagger-api/swagger-ui      |
| Hibernator-Validator | 驗證框架            | http://hibernate.org/validator                 |

#### 前端技術

| 技術       | 說明                  | 官網                                   |
| ---------- | --------------------- | -------------------------------------- |
| Vue        | 前端框架              | https://vuejs.org/                     |
| Vue-router | 路由框架              | https://router.vuejs.org/              |
| Vuex       | 全局狀態管理框架      | https://vuex.vuejs.org/                |
| Element    | 前端UI框架            | https://element.eleme.io               |
| Axios      | 前端HTTP框架          | https://github.com/axios/axios         |
| v-charts   | 基於Echarts的圖表框架 | https://v-charts.js.org/               |
| Js-cookie  | cookie管理工具        | https://github.com/js-cookie/js-cookie |
| nprogress  | 進度條控件            | https://github.com/rstacruz/nprogress  |

#### 架構圖

##### 系統架構圖

![系統架構圖](http://img.macrozheng.com/mall/project/mall_micro_service_arch.jpg)

##### 業務架構圖

![系統架構圖](http://img.macrozheng.com/mall/project/mall_business_arch.png)

#### 模塊介紹

##### 後臺管理系統 `mall-admin`

- 商品管理：[功能結構圖-商品.jpg](document/resource/mind_product.jpg)
- 訂單管理：[功能結構圖-訂單.jpg](document/resource/mind_order.jpg)
- 促銷管理：[功能結構圖-促銷.jpg](document/resource/mind_sale.jpg)
- 內容管理：[功能結構圖-內容.jpg](document/resource/mind_content.jpg)
- 用戶管理：[功能結構圖-用戶.jpg](document/resource/mind_member.jpg)

##### 前臺商城系統 `mall-portal`

[功能結構圖-前臺.jpg](document/resource/mind_portal.jpg)

#### 開發進度

![項目開發進度圖](http://img.macrozheng.com/mall/project/mall_dev_flow.png)

## 環境搭建

### 開發工具

| 工具          | 說明                | 官網                                            |
| ------------- | ------------------- | ----------------------------------------------- |
| IDEA          | 開發IDE             | https://www.jetbrains.com/idea/download         |
| RedisDesktop  | redis客戶端連接工具 | https://github.com/qishibo/AnotherRedisDesktopManager  |
| Robomongo     | mongo客戶端連接工具 | https://robomongo.org/download                  |
| SwitchHosts   | 本地host管理        | https://oldj.github.io/SwitchHosts/             |
| X-shell       | Linux遠程連接工具   | http://www.netsarang.com/download/software.html |
| Navicat       | 數據庫連接工具      | http://www.formysql.com/xiazai.html             |
| PowerDesigner | 數據庫設計工具      | http://powerdesigner.de/                        |
| Axure         | 原型設計工具        | https://www.axure.com/                          |
| MindMaster    | 思維導圖設計工具    | http://www.edrawsoft.cn/mindmaster              |
| ScreenToGif   | gif錄製工具         | https://www.screentogif.com/                    |
| ProcessOn     | 流程圖繪製工具      | https://www.processon.com/                      |
| PicPick       | 圖片處理工具        | https://picpick.app/zh/                         |
| Snipaste      | 屏幕截圖工具        | https://www.snipaste.com/                       |
| Postman       | API接口調試工具      | https://www.postman.com/                        |
| Typora        | Markdown編輯器      | https://typora.io/                              |

### 開發環境

| 工具          | 版本號 | 下載                                                         |
| ------------- | ------ | ------------------------------------------------------------ |
| JDK           | 1.8    | https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html |
| Mysql         | 5.7    | https://www.mysql.com/                                       |
| Redis         | 5.0    | https://redis.io/download                                    |
| MongoDB       | 4.2.5  | https://www.mongodb.com/download-center                      |
| RabbitMQ      | 3.7.14 | http://www.rabbitmq.com/download.html                        |
| Nginx         | 1.10   | http://nginx.org/en/download.html                            |
| Elasticsearch | 7.6.2  | https://www.elastic.co/downloads/elasticsearch               |
| Logstash      | 7.6.2  | https://www.elastic.co/cn/downloads/logstash                 |
| Kibana        | 7.6.2  | https://www.elastic.co/cn/downloads/kibana                   |

### 搭建步驟

> Windows環境部署

- Windows環境搭建請參考：[mall在Windows環境下的部署](http://www.macrozheng.com/#/deploy/mall_deploy_windows);
- 注意：只啟動mall-admin,僅需安裝Mysql、Redis即可;
- 克隆`mall-admin-web`項目，並導入到IDEA中完成編譯：[前端項目地址](https://github.com/macrozheng/mall-admin-web);
- `mall-admin-web`項目的安裝及部署請參考：[mall前端項目的安裝與部署](http://www.macrozheng.com/#/deploy/mall_deploy_web)。

> Docker環境部署

- 使用虛擬機安裝CentOS7.6請參考：[虛擬機安裝及使用Linux，看這一篇就夠了](http://www.macrozheng.com/#/reference/linux_install);
- Docker環境的安裝請參考：[開發者必備Docker命令](http://www.macrozheng.com/#/reference/docker);
- 本項目Docker鏡像構建請參考：[使用Maven插件為SpringBoot應用構建Docker鏡像](http://www.macrozheng.com/#/reference/docker_maven);
- 本項目在Docker容器下的部署請參考：[mall在Linux環境下的部署（基於Docker容器）](http://www.macrozheng.com/#/deploy/mall_deploy_docker);
- 本項目使用Docker Compose請參考： [mall在Linux環境下的部署（基於Docker Compose）](http://www.macrozheng.com/#/deploy/mall_deploy_docker_compose);
- 本項目在Linux下的自動化部署請參考：[mall在Linux環境下的自動化部署（基於Jenkins）](http://www.macrozheng.com/#/deploy/mall_deploy_jenkins);

> 相關環境部署

- ELK日誌收集系統的搭建請參考：[SpringBoot應用整合ELK實現日誌收集](http://www.macrozheng.com/#/technology/mall_tiny_elk);
- 使用MinIO存儲文件請參考：[前後端分離項目，如何優雅實現文件存儲](http://www.macrozheng.com/#/technology/minio_use);
- 讀寫分離解決方案請參考：[你還在代碼裡做讀寫分離麼，試試這個中間件吧](http://www.macrozheng.com/#/reference/gaea);
- Redis集群解決方案請參考：[Docker環境下秒建Redis集群，連SpringBoot也整上了！](http://www.macrozheng.com/#/reference/redis_cluster)。

## 公眾號

學習不走彎路，關注公眾號「**macrozheng**」，回覆「**學習路線**」，獲取mall項目專屬學習路線！

加微信群交流，公眾號後臺回覆「**加群**」即可。

![公眾號圖片](http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/banner/qrcode_for_macrozheng_258.jpg)

## 許可證

[Apache License 2.0](https://github.com/macrozheng/mall/blob/master/LICENSE)

Copyright (c) 2018-2021 macrozheng
