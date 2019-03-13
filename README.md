# spring-git-information
验证在spring web项目中展示版本信息.
## 编译
```shell
mvn package 
```

## 访问方式
```shell
curl http://localhost:8080/version
```
```shell
curl http://localhost:8080/branch
```

## 其他信息
以下信息都能获取都
```json
{
    "git.build.user.email":"licong@xxx.net",
    "git.build.host":"mac-pro",
    "git.dirty":"true",
    "git.remote.origin.url":"git@github.com:hellojukay/spring-git-information.git",
    "git.closest.tag.name":"",
    "git.commit.id.describe-short":"ba35340-dirty",
    "git.commit.user.email":"licong@xxx.net",
    "git.commit.time":"2019-03-12T09:54:03+0800",
    "git.commit.message.full":"add README",
    "git.build.version":"0.0.1-SNAPSHOT",
    "git.commit.message.short":"add README",
    "git.commit.id.abbrev":"ba35340",
    "git.branch":"master",
    "git.build.user.name":"licong",
    "git.closest.tag.commit.count":"",
    "git.commit.id.describe":"ba35340-dirty",
    "git.commit.id":"ba35340065ccf9df95357368e685508ac6c8ba92",
    "git.tags":"",
    "git.build.time":"2019-03-13T00:21:03+0800",
    "git.commit.user.name":"licong"
}
```
