#!/bin/bash

sleep 3

NAMES=('anda' 'andi' 'andu' 'ande' 'ando' 'manda' 'mandi' 'mandu')
VOCALS=('a' 'i' 'u' 'e' 'o' 'a' 'i' 'u')
GENDER=('l' 'p')

write_student ()
{
    xdotool type $1
    xdotool key 'Return'
    xdotool type $2
    xdotool key 'Return'
    xdotool type $3
    xdotool key 'Return'
    xdotool type $4
    xdotool key 'Return'
    xdotool type $2
    xdotool key 'Return'
    xdotool type $2
    xdotool key 'Return'
    xdotool type $2
    xdotool key 'Return'
    xdotool type $3
    xdotool key 'Return'
}

COUNTER=0

for name in "${NAMES[@]}"; do
    RAND=$[$RANDOM % ${#GENDER[@]}]
    write_student $name ${VOCALS[COUNTER]} $COUNTER ${GENDER[$RAND]}
    let COUNTER++
done

exit 0

