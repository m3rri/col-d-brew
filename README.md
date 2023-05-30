COL D BREW web kiosk
===
> **Col D Brew Project**  
> Bean, ColdBrew, Orders Management system for [SW 연구소 - KT 21F]

![java](https://img.shields.io/badge/Amazon%20Corretto-jdk%2017-007396)
![springboot](https://img.shields.io/badge/Spring%20Boot-3.0.6-6DB33F)
![mysql](https://img.shields.io/badge/mysql-8.0.32-00758F)
![querydsl](https://img.shields.io/badge/Query%20Dsl-5.0.0-0A8FCF)
![mapstruct](https://img.shields.io/badge/Map%20Struct-1.5.3-E94E1B)
![thymeleaf](http://img.shields.io/badge/-thymeleaf-005F0F?logo=Thymeleaf&logoColor=white)

## Getting Stared
### Dependencies
* Language
  * Web : Java / javascript
  * DB  : mysql
* Framework : Spring Boot 3.0
  * Build tool : gradle
  * ORM : SpringJPA + queryDsl
* Thymeleaf, MapStruct

## Documentation
- name convention
  |case name|description|example|
  |---------|-----------|-------|
  |camelCase|__javascript__ : variable(+object, function)|`let moduleStatus = 'ready';`|
  ||__java__ : package, variable, method|`private String moduleStatus;`|
  |PascalCase|__java__ : class, interface, enum|`HomeController.java`|
  |snake_case|__db__ : table, columne _not_capitalize_|**❕** refer to below code block|
  ||__constant__ : javascript, java(+enum) _ALL_CAPITALIZE_|`const HEADER_NAME = 'text/html';`|
  |kebab-case|__java__ : url|in case using query string or path value, following variable convention(_camel_)|
  ||__spring resource__ : html, javascript, css, yml, json file and directory|`common-fetch.js`|
  ||__git__ : branch|`feature/{page-name}/{feature-name}-{developer-name}`|