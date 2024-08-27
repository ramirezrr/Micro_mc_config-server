# Config server Micro_mc_config-server

- **Título**: `Micro_mc_config`
- **Versión**: `1.0.0`
- **Autor**: `Rodrigo R.`
- **Curso**: `Mitocode`
- **Estado**: `Publico`
- 
## Descripción

Este proyecto es un **Servidor de Configuración** basado en Spring Cloud, diseñado para la gestión centralizada de propiedades de configuración. Utiliza Spring Cloud Config Server para proporcionar una fuente central de configuración para aplicaciones distribuidas.

## Características

- **Servidor de Configuración:** Configura y gestiona las propiedades de configuración centralizadas.
- **Integración con Eureka:** Se registra automáticamente en un servidor Eureka para el descubrimiento de servicios.
- **Soporte para Git:** Usa un repositorio Git como fuente de configuración.
- **Configuración de Puerto:** Expone el servidor en el puerto `9001`.

## Requisitos

- **Java 21**
- **Spring Boot 3.3.2**
- **Spring Cloud 2023.0.3**

## Dependencias

El proyecto utiliza las siguientes dependencias principales:

- `spring-cloud-config-server`
- `spring-cloud-starter`
- `spring-cloud-starter-netflix-eureka-client`
- `httpclient` (para solucionar vulnerabilidad en `spring-cloud-starter-netflix-eureka-client`)
- `xstream`
- `woodstox-core`

## Configuración

### `application.yml`

```yaml
server:
  port: 9001

spring:
  application:
    name: Micro_mc_config-server
  cloud:
    config:
      server:
        git:
          uri: https://github.com/ramirezrr/Micro_mc_config-server-repo.git
          default-label: devMitocode
          clone-on-start: true
          refresh-rate: 10
#          username: xxx
#          password: xxx

eureka:
  client:
    fetch-registry: true
    register-with-eureka: true
    service-url:
      default-zone: http://discovery1:8761/eureka
  instance:
    lease-expiration-duration-in-seconds: 2
    lease-renewal-interval-in-seconds: 2
```

```bash
   git clone git@github.com:ramirezrr/Micro_mc_config-server.git
```
> [IMPORTANT]
# Configuración Adicional
## Editar el archivo `/etc/hosts`
Para que las instancias de Eureka Server se reconozcan entre sí, es necesario editar el archivo `/etc/hosts` de tu sistema y agregar las siguientes entradas:
```bash
127.0.0.1       discovery1
```


# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/3.3.3/gradle-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.3.3/gradle-plugin/packaging-oci-image.html)
* [Config Server](https://docs.spring.io/spring-cloud-config/docs/current/reference/html/#_spring_cloud_config_server)
* [Eureka Discovery Client](https://docs.spring.io/spring-cloud-netflix/docs/current/reference/html/#service-discovery-eureka-clients)
* [Cloud Bootstrap](https://docs.spring.io/spring-cloud-commons/docs/current/reference/html/)

### Guides

The following guides illustrate how to use some features concretely:

* [Centralized Configuration](https://spring.io/guides/gs/centralized-configuration/)
* [Service Registration and Discovery with Eureka and Spring Cloud](https://spring.io/guides/gs/service-registration-and-discovery/)

### Additional Links

These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

