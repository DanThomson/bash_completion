#! /usr/bin/env dash
# completion for sc


source /usr/share/bash-completion/completions/systemctl

complete -F _systemctl sc
