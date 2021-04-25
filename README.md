# jni-demo-java
这个demo是介绍Java怎么引用C/C++ so库，也包含了详细过程

> 如果遇到问题随时咨询：kl023011@163.com，会帮您一一解答

### 先进入`src`目录
进入`jni-demo-java/src`目录，**这一步很重要，因为后边生成`.h`头文件的时候必须在这个根目录下**

### 然后执行javac命令，编译HelloJNI.java源文件
```
javac com/jni/hello/HelloJNI.java
```

### 执行javah命令，生成头文件
```
javah com.jni.hello.HelloJNI
```
生成`com_jni_hello_HelloJNI.h`

生成头文件后给到C/C++工程师，进行开发，并生成`so.so`库放到HelloJNI.java同级目录下

### 最后，运行java命令，执行.class
```
java com.jni.hello.HelloJNI
```
这个命令就会运行HelloJNI类中的main方法了

### 开源




