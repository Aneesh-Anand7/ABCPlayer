/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar ABCgrammar;
import Configuration;

root: header body EOF;
header: index ('\r\n' | '\n') title ('\r\n' | '\n') (line ('\r\n' | '\n'))* key ('\r\n' | '\n');
index: 'X' ':' NUMBER;
/* 
 * IS THIS GOOD?
 * Put letters in quotes?
 */ 
title: 'T' ':' STRING; 
key: ('_' | '^')? NOTE;
line: length | composer | meter | tempo | voice;
length: 'L' ':' NUMBER '/' NUMBER; 
composer: 'C' ':' STRING;
meter: 'M' ':' (NUMBER '/' NUMBER) | 'C' | 'C' '|';
tempo: 'Q' ':' NUMBER;
voice: 'V' ':' STRING;

NOTE: [A-G] ('M' | 'm')?;
STRING: (.)+?;
NUMBER: [0-9]+;

/*Check with George*/
body: STRING;


SPACES : [ ]+ -> skip;
