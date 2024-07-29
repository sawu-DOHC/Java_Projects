Java Exceptions 

The exceptions highlighted with an X for a bullet point are demonstrated in this project.

1. Checked Exceptions
   Checked exceptions are exceptions that are checked at compile-time. The Java compiler ensures 
   that these exceptions are either caught or declared in the method signature using the `throws` 
   keyword. Here are some common checked exceptions:

    - IOException: Thrown when an input or output operation fails or is interrupted.

    - SQLException: Thrown when there is an error accessing a database.

    - ClassNotFoundException: Thrown when an application tries to load a class through its string 
      name but no definition for the class with the specified name could be found.

    - InstantiationException: Thrown when an application tries to create an instance of a class 
      using the newInstance method but the specified class object cannot be instantiated.

    - InterruptedException: Thrown when a thread is waiting, sleeping, or otherwise occupied, 
      and the thread is interrupted.

    - NoSuchMethodException: Thrown when a particular method cannot be found.

    X FileNotFoundException: Thrown when an attempt to open the file denoted by a specified 
      pathname has failed.



2. Unchecked Exceptions
   Unchecked exceptions are exceptions that are not checked at compile-time but are checked at runtime. 
   They are subclasses of `RuntimeException`. Here are some common unchecked exceptions:

    - NullPointerException: Thrown when an application attempts to use null in a case where an object 
      is required.

    X ArrayIndexOutOfBoundsException: Thrown to indicate that an array has been accessed with an illegal index.

    X ArithmeticException: Thrown when an exceptional arithmetic condition has occurred, such as division by zero.

    - ClassCastException: Thrown to indicate that the code has attempted to cast an object to a subclass 
      of which it is not an instance.

    - IllegalArgumentException: Thrown to indicate that a method has been passed an illegal or inappropriate argument.

    X NumberFormatException: Thrown to indicate that an application has attempted to convert a string to one of the numeric 
      types but that the string does not have the appropriate format.

    - IllegalStateException: Thrown to indicate that a method has been invoked at an illegal or inappropriate time.

    X InputMismatchException: Thrown by a scanner to indicate that the next token does not match the expected pattern.




3. Errors 
   Errors are not exceptions but issues that are usually beyond the control of the application. They are subclasses of Error and usually indicate serious problems that a reasonable application should not try to catch. Some common errors are:

    - OutOfMemoryError: Thrown when the Java Virtual Machine cannot allocate an object because it is out of memory.
    - StackOverflowError: Thrown when a stack overflow occurs because an application recurses too deeply.
    - VirtualMachineError: Thrown to indicate that the Java Virtual Machine is broken or has run out of resources necessary 
      for it to continue operating.
    - AssertionError: Thrown to indicate that an assertion has failed.
