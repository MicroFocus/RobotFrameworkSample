*** Settings ***
Library    org.robotframework.javalib.library.AnnotationLibrary    Keywords.class

*** Test Cases ***
TestCase1
  start_application
  login	email=john.smith@gmail.com	password=john
  logout