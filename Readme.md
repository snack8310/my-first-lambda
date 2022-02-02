## 我的第一个Lambda函数

## 编译Layer
```
set -eo pipefail
gradle -q packageLibs
mv build/distributions/my-first-lambda-0.0.1-SNAPSHOT.zip build/distributions/my-first-lambda-layer-0.0.1.zip    
```

## 编译Function
```
set -eo pipefail
gradle build
```