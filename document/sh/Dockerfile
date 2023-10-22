# 該鏡像需要依賴的基礎鏡像
FROM java:8
# 將當前目錄下的jar包複製到docker容器的/目錄下
ADD mall-admin-1.0-SNAPSHOT.jar /mall-admin-1.0-SNAPSHOT.jar
# 聲明服務運行在8088端口
EXPOSE 8080
# 指定docker容器啟動時運行jar包
ENTRYPOINT ["java", "-jar","/mall-admin-1.0-SNAPSHOT.jar"]
# 指定維護者的名字
MAINTAINER macro