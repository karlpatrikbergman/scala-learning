# Programming in Scala

## Git
I use https and two factor so I need dev access tokens, but I don't want to type them every time 

Add git credential helper on Fedora
```shell
git config --global credential.helper /usr/libexec/git-core/git-credential-libsecret
```
Add git credential helper on Ubuntu:
```shell
git config --global credential.helper /usr/share/doc/git/contrib/credential/libsecret/git-credential-libsecret (However I this won't work. I don't know why)
```
Can't get this to work on Ubuntu though?

#### My git repos
kpb
https://karlpatrikbergman@github.com/karlpatrikbergman/scala-learning.git

ptrkbrgmn	    
https://ptrkbrgmn@github.com/ptrkbrgmn/scala-learning.git

### Pushing to multiple git repositories 
https://gist.github.com/rvl/c3f156e117e22a25f242

Create new remote 'origin'
```shell
git remote add origin https://karlpatrikbergman@github.com/karlpatrikbergman/scala-learning.git
```

Add multiple repo urls to 'origin'
Commands below will change the remote.origin.pushurl config entry. Now pushes will send to both of these destinations, rather than the fetch URL.
```shell
git remote set-url --add --push origin https://karlpatrikbergman@github.com/karlpatrikbergman/scala-learning.git
git remote set-url --add --push origin https://ptrkbrgmn@github.com/ptrkbrgmn/scala-learning.git
```
Now you can push to both repositories by running
```shell
git push origin
```
