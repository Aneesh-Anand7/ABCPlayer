/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar ABCgrammar;
import Configuration;

root: header EOF;
header: index title (line)* key;
index: 'X:' NUMBER endofline;
/* 
 * IS THIS GOOD?
 * Put letters in quotes?
 */ 
title: 'T:' STRING endofline; 
key: 'K:' NOTE endofline;
line: length | composer | meter | tempo | voice | comment;
length: 'L:' NUMBER '/' NUMBER endofline; 
composer: 'C:' STRING endofline;
meter: 'M:' (NUMBER '/' NUMBER) | 'C' | 'C|';
tempo: 'Q:' NUMBER '/' NUMBER '=' NUMBER endofline;
voice: 'V:' STRING endofline;

endofline: comment | NEWLINE;
comment: '%' STRING NEWLINE;

NOTE: ([A-G])|([a-g]) ('#'|'b')? ('M' | 'm')?;
STRING: (.)+?;
NUMBER: [0-9]+;
NEWLINE: ('\r'('\n')? | '\n');

/*Check with George*/
body: STRING;


SPACES : [ ]+ -> skip;
