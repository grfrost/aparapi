java ^
   -Djava.library.path=..\..\ ^
   -Dcom.amd.aparapi.executionMode=%1 ^
   -Dcom.amd.aparapi.enableShowGeneratedOpenCL=true ^
   -Dcom.amd.aparapi.enableShowFakeLocalVariableTable=true ^
   -Dsize=%2 ^
   -Diterations=%3 ^
   -classpath blackscholes.jar;..\..\aparapi.jar ^
   com.amd.aparapi.samples.blackscholes.Main 
