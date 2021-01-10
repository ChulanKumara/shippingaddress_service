FROM maven AS builder
RUN mkdir -p app/shipping/source
COPY . /app/shipping/source
WORKDIR /app/shipping/source
RUN mvn clean package -Dmaven.test.skip=true

FROM  java:8 as vm
COPY --from=builder /app/shipping/source/target/*.jar /app/shipping/shipping_service.jar
WORKDIR /app/product
EXPOSE 8083
ENTRYPOINT ["java","-jar","product_service.jar","--spring.profiles.active=${ENV}"]