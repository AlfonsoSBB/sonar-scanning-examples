package com.acme.basic;

import java.util.logging.Logger;

public class HelloWorld {

  Logger logger = Logger.getLogger(getClass().getName());

  void sayHello() {
    logger.info("Hello World!");
  }

  void notCovered() {
    logger.info("This method is not covered by unit tests");
  }

}
