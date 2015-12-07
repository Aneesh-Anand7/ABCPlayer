/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar ABCgrammar;
import Configuration;

root: index title line* key EOF;
index: 'X:' NUMBER endofline;
title: 'T:' (STRING | NUMBER)+ endofline;
key: KEY;

line: (length | composer | meter | tempo | voice | comment) endofline;

length: 'L:' NUMBER '/' NUMBER ; 
composer: 'C:' STRING+ ;
meter: 'M:' ((NUMBER '/' NUMBER) | 'C' | 'C|') ;
tempo: 'Q:' NUMBER '/' NUMBER '=' NUMBER ;
voice: 'V:' (STRING | NUMBER)+ ;

endofline: comment | NEWLINE;
comment: '%' STRING NEWLINE;


KEY: 'K:' ([A-G]|[a-g]) ('#'|'b')? ('M' | 'm')?;
STRING: ([A-Za-z'\'''\.'','])+ ; /* no new lines */
NUMBER: [0-9]+;
NEWLINE: ('\r'('\n')? | '\n');

SPACES : [ ]+ -> skip;
