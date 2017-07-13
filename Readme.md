# Clojure langaguge learning notes

This is my attempt to learn the clojure language.

Links: 

- https://clojure.org/
- http://tryclj.com/ (browser-based Clojure REPL)
- https://leiningen.org/

   
Just need JVM, and the clojure jar to get a repl: https://clojure.org/community/downloads

```bash
wget https://repo1.maven.org/maven2/org/clojure/clojure/1.8.0/clojure-1.8.0.zip
unzip clojure-1.8.0.zip
java -cp clojure-1.8.0/clojure-1.8.0.jar clojure.main
```

Looks like Leiningen is the build tool:

>    Leiningen is a build and project management tool written in Clojure and used pervasively throughout the Clojure community.

Had to hack the `lein` installer script for use at work because of the stupid proxy. `lein` is problematic
at work because it will try and download packages and the proxy will mess with the certificates\

Questions:

- What's the file extension?
- What editor / IDE?
    - Notepad++ doesn't have a clojure mode.  Has a lisp mode though
    - https://nightcode.info
    - for now any text ed will do

    
First up, a hello world

## Hello world , repl

```clojure
(println "hello world")
(javax.swing.JOptionPane/showMessageDialog nil "Hello World")
```

## Running form the command line

```bash
$ java -cp clojure-1.8.0/clojure-1.8.0.jar clojure.main hello-world/hello-world.clj
Hello, World!
```

Woohooo!
