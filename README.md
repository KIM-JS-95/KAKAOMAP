## Electronic Charge station [![Build Status](https://travis-ci.org/KIM-JS-95/KAKAOMAP.svg?branch=main)](https://travis-ci.org/KIM-JS-95/KAKAOMAP)

[WEBSITE DNS]  http://www.ecstation.tk/

Create a map that Charge station for electric vehicles With KAKAO Api

카카오 api를 사용하여 개발한 전기충전소 위치 제공 서비스입니다. 

웹에서 간단한 주소를 입력하여 편리하게 지도로 확인가능하며 충전시간동안 여유시간을 이용하여 편의 시설을 이용할 수 있도록 공공시설 레이아웃을 제공합니다. 

## VERSION
 1. JAVA -VERSION 15.0
 2. GRADLE -VERSION 4.10.2

## DEBUGING LOG
2020.12.6 LOAD KAKAO API KEY, CREATE MAP IN MUSTACHE(HTML)

2020.12.8 POSTS, INTERFACE REPOSITORY, KAKAO MAPPING

2020.12.9 DB, UTF-8 INCODING

2021.1.2 print add Depend on select box text

2021.1.3 build up pages with css, html

## DEV.PLAN
 ~~CREATE A KAKAO API KEY~~

~~SHOW UP A KAKAO MAP~~

~~CONNECT to h2-database and Insert address data~~

~~SHOW UP ADD IN WEB PAGE~~
 
~~CREATE A PAGE THAT SEARCHING ADDRESS PAGE~~

~~creat select box for search address~~

 ~~SEND A VAR(ADDRESS) TO MAP POINT.JS~~


# Intro
### 1.MAIN PAGE
![1](https://user-images.githubusercontent.com/65659478/103516363-c1a72000-4eb3-11eb-98d6-ddb5b29c0d1c.jpg)
![4](https://user-images.githubusercontent.com/65659478/103996407-25478b00-51dd-11eb-8104-5e27c4ae8e24.jpg)
It consists of four-part slides that can be moved by scrolling and configured responsively so that the page size changes freely depending on the size. 

You can search for addresses on the MAP slide No. 3, and when you do, go to the ADD Searching page.




### 2. Adresses Searching page
![2](https://user-images.githubusercontent.com/65659478/103516428-e00d1b80-4eb3-11eb-98af-368e51c7b155.jpg)

If the address search was successful, we had the DB bring in and display the entities that contained the address.

Click an address to send it to the MAP page and display it on the map.

It consists of 5 slides so you can check the information you need, such as developer information and vehicle company homepage.

### 3. Map page
![3](https://user-images.githubusercontent.com/65659478/103516433-e13e4880-4eb3-11eb-985e-75777cbfe3a3.jpg)

Map configured using KAKAO map api.

The address coordinates received from the previous page have been configured to show the location on the map, and a layout to check the location of the amenities has been added so that convenience can be used during the vehicle charging time.