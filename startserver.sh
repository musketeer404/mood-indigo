#!/bin/zsh

##Start the minecraft server##
forge-1.12.2d start &&

##Start ngrok##
cd ~/ngrok && ./ngrok tcp 25565
