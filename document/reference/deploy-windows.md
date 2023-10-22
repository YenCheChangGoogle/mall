# windows下環境搭建

## IDEA

- 關於IDEA的安裝與使用具體參考[https://github.com/judasn/IntelliJ-IDEA-Tutorial](https://github.com/judasn/IntelliJ-IDEA-Tutorial)
- 搜索插件倉庫，安裝插件lombok

## Eclipse

- 導入項目，以maven項目形式導入  
    ![eclipse_import_1.png](https://github.com/macrozheng/mall/blob/master/document/resource/eclipse_import_1.png)  
    ![eclipse_import_2.png](https://github.com/macrozheng/mall/blob/master/document/resource/eclipse_import_2.png)
- 安裝lombok插件，下載地址：https://projectlombok.org/downloads/lombok.jar  
- 下載完後雙擊，使用java程序打開
- 按照提示選擇eclipse.exe的安裝路徑安裝插件，完成後重啟Eclipse
- 啟動項目：右擊com.macro.mall.MallAdminApplication的main方法，選擇run as Java Application

## mysql

- 下載地址：https://dev.mysql.com/downloads/mysql/5.7.html#downloads
- 下載後按提示進行安裝
- 導入document/sql下的mall.sql文件

## redis

- 下載地址：https://github.com/MicrosoftArchive/redis/releases
- 下載後按提示進行安裝
- 啟動redis:redis-server.exe redis.windows.conf

## elasticsearch

- 下載地址：https://www.elastic.co/downloads/past-releases/elasticsearch-6-2-2
- 下載.zip文件，解壓到指定目錄
- 安裝kibana，用於在瀏覽器中訪問es,請下載6.2.2版本，具體參考：https://www.elastic.co/downloads/kibana
- 下載.zip包後解壓即可，運行bin\kibana.bat，訪問http://localhost:5601 查看是否安裝成功
- 中文分詞插件地址：https://github.com/medcl/elasticsearch-analysis-ik
- 安裝中文分詞插件，在elasticsearch-6.2.2\bin目錄下執行以下命令：
elasticsearch-plugin install https://github.com/medcl/elasticsearch-analysis-ik/releases/download/v6.2.2/elasticsearch-analysis-ik-6.2.2.zip
- 啟動elasticsearch:運行elasticsearch-6.2.2\bin\elasticsearch.bat
- 不使用kibana的可以安裝head插件，具體參考：https://github.com/mobz/elasticsearch-head
- 注意：如果你修改了mall-search中的es的cluster-name: mall-es，你需要在elasticsearch-6.2.2\config\elasticsearch.yml文件中修改cluster.name: mall-es

## mongodb

- 下載地址：https://fastdl.mongodb.org/win32/mongodb-win32-x86_64-2008plus-ssl-3.2.21-signed.msi
- 選擇路徑（c:\mongodb\）進行安裝，在安裝路徑下創建data\db和data\log兩個文件夾
- 服務端運行程序：mongodb\bin\mongod.exe
- 客戶端運行程序：mongodb\bin\mongo.exe
- 創建配置文件：mongodb\mongod.cfg
    ``` lua
    systemLog:
        destination: file
        path: c:\mongodb\data\log\mongod.log
    storage:
        dbPath: c:\mongodb\data\db
    ```
- 安裝為服務（運行命令需要用管理員權限）：C:\mongodb\bin\mongod.exe --config "C:\mongodb\mongod.cfg" --install
- 啟動服務：net start MongoDB
- 關閉服務：net stop MongoDB
- 移除服務：C:\mongodb\bin\mongod.exe --remove
- 下載客戶端程序：https://download.robomongo.org/1.2.1/windows/robo3t-1.2.1-windows-x86_64-3e50a65.zip
- 解壓到指定目錄，打開robo3t.exe並連接到localhost:27017

## rabbitmq

- 安裝Erlang：http://erlang.org/download/otp_win64_21.3.exe
- 下載rabbitmq：https://dl.bintray.com/rabbitmq/all/rabbitmq-server/3.7.14/rabbitmq-server-3.7.14.exe
- 按照提示進行安裝，安裝完成後進入rabbitmq的安裝目錄:D:\RabbitMQ Server\rabbitmq_server-3.7.14\sbin
- 在地址欄輸入cmd並回車啟動命令行輸入以下命令：rabbitmq-plugins enable rabbitmq_management
- 訪問地址查看是否安裝成功：http://localhost:15672/
- 輸入賬號密碼登錄：guest guest
- 創建用戶並設置其角色為管理員：mall mall
    ![rabbitmq_install_2.png](https://github.com/macrozheng/mall/blob/master/document/resource/rabbitmq_install_2.png)
- 創建virtual host:/mall
    ![rabbitmq_install_3.png](https://github.com/macrozheng/mall/blob/master/document/resource/rabbitmq_install_3.png)
- 給mall用戶配置範圍該virtual host的權限
    ![rabbitmq_install_4.png](https://github.com/macrozheng/mall/blob/master/document/resource/rabbitmq_install_4.png)
- rabbitmq安裝延遲消息插件（可不裝）：
    - 下載延遲消息插件（rabbitmq_delayed_message_exchange）：https://www.rabbitmq.com/community-plugins.html
    - 複製插件到插件目錄：D:\RabbitMQ Server\rabbitmq_server-3.7.14\plugins
    - 在sbin目錄下運行如下命令啟用插件：rabbitmq-plugins enable rabbitmq_delayed_message_exchange
    
## OSS

- 該項目文件上傳採用OSS，需要自行註冊OSS賬號並配置
- 首先將mall-admin\src\main\resources\application.properties文件中以aliyun.oss.開頭的配置改為你自己的配置
- OSS上傳文件需要配置跨域資源共享(CORS)規則，參考文檔：https://help.aliyun.com/document_detail/31928.html
- 上傳方式採用服務端簽名後直傳的形式，參考文檔：https://help.aliyun.com/document_detail/31926.html

## mall-admin

- 啟動項目：直接運行com.macro.mall.MallAdminApplication的main方法即可
- 接口文檔地址：http://localhost:8080/swagger-ui.html

## mall-search

- 啟動項目：直接運行com.macro.mall.search.MallSearchApplication的main方法即可
- 接口文檔地址：http://localhost:8081/swagger-ui.html
- 使用前需要先調用接口導入數據；http://localhost:8081/esProduct/importAll
- 如出現無法啟動的問題，可以先刪除elasticsearch裡面的數據再啟動

## mall-portal

- 啟動mall-portal項目：直接運行com.macro.mall.portal.MallPortalApplication的main方法即可
- 接口文檔地址：http://localhost:8085/swagger-ui.html
