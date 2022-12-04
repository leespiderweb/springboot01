
其他记录
1数据库修改名字
use master
exec sp_renamedb @dbname='test', @newname='springtest';


git 
0.删除远程分支
 git remote rm origin
1.再次添加 
  git remote add origin git@github.com:leespiderweb/springboot01.git
2.推送
  git push -u origin master（首次）
  git push   origin master （后续）