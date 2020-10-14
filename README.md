# -flavor-demo

本demo两点学习
1. MVP简单demo
2. 多flavor简单demo



# 背景

1. 业务库代码已经很完善了，迭代需求较少，可以腾出精力搞重构，故需要在MVP or MVVM上进行探索，比对两者差异，定制化解决当前业务痛点

2. 组件化，多仓拆分，各业务线维护自身业务，普通版与专业版差异化代码



有两个APP，例如普通版与专业版，使用能力大部分相同，仅需要部分差异化定制，而这大部分代码又没有抽象成公共层代码，就可以使用多flavor来迭代业务。



多flavor相较多git分支的好处：

若公共层代码出问题不用两个分支都改一次，只需要改一份就行。





# 参考链接

[链接1](https://www.dazhuanlan.com/2019/10/26/5db45563aa374/?__cf_chl_jschl_tk__=71cbfd26f2dcae57eacab71f9c2c4cb9cb07b857-1602577353-0-ASK8lLhUXFXP--4MNyH-Xoq0pRgmAwcdIkXNvI0D_vHx88AfGbGWNUxzizyZ6Vru9yILyG6ZWdGWGnMpoEV4gBRGt9AI44iNTajzsc49Mh8Zc7sVxc05yZxqmQo3WcDZvkoGIKYoeOYeH4jqJBt_KUuBmUVZx3FjuTWjBOPNURL2tnxMOOA7FGBICRlKkQLlCtEkUvBcYC-IeAiiW1UuYpkwJ1tRZh1At1MDkQKradtyYvABVJZpXSuhZ6iODNp13KLIxLLp0ZBfPThQCCU5h_9ptWSN-Ae0ZPbQCoi2AG19arOnFG2MkZVWLXfrNiJq-w)

[链接2](http://lyldalek.cn/2019/09/10/blog_bak/Blog/Gradle/productFlavors%E4%B8%8EbuildTypes/)