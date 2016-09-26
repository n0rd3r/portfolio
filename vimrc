set clipboard=unnamed
inoremap jk <ESC>
cmap eee %s/\~/\~\r/g
cmap jjp %!node ~/dev/nordinho-script/jsonpretty-stdin.js
cmap jjl !clear && jslint %
cmap pp r !pbpaste
syntax off
set ruler
set nocompatible
set showmode
set tabstop=4
set shiftwidth=4
set expandtab
set noautoindent
set smartindent
set wildmenu
set number
let loaded_matchparen = 1
set encoding=utf-8
set statusline=%F:
set statusline+=%l:%v
set laststatus=2


filetype plugin indent on
