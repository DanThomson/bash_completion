# Bash completions for `/usr/local/bin`

## First, check for and delete or move potential collisions

## Change ownership of `bash_completion.d`
``` bash
sudo chown -R Daniel.Thomson:Daniel.Thomson .
```

## Clone repo
``` bash
cd /etc/bash_completion.d/
git init
git remote add origin git@github.com:DanThomson/home.git
git fetch origin
git checkout -b trunk --track origin/trunk
```

## Test it out
``` bash
sc <TAB>
# Look for list of subcommands for systemctl
```
