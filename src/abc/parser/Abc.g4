/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Abc;
import Configuration;

root: (line)+ EOF;
line: (element)+ NEWLINE | bodyvoice | comment;
element: noteelem | tupletelem | barline | nthrepeat | WHITESPACE;

noteelem: note | multinote;
/* notes can be notes or rests */
note: noteorrest notelength?;
noteorrest: pitch | REST;
pitch: ACCIDENTAL? BASENOTE OCTAVE?;

notelength: (DIGIT+) ('/' (DIGIT+)?)?;
/* ^ is sharp, _ is flat, = is neutral */

/* tuplets */
tupletelem: tupletspec noteelem+;
tupletspec: '(' DIGIT;
/* chords */
multinote: '[' note+ ']';
/* barlines */
barline: '|'|'||'|'[|'|'|]'|':|'|'|:';
nthrepeat: '[1'|'[2';

/*voice field reappears- direct to other voice */
bodyvoice: 'V' ':' STRING;

comment: '%' STRING NEWLINE;
endofline: comment | NEWLINE;

OCTAVE: ('\'')+ | (',')+;
ACCIDENTAL: '^'|'^^'|'_'|'__'|'=';
BASENOTE: 'C'|'D'|'E'|'F'|'G'|'A'|'B'|'c'|'d'|'e'|'f'|'g'|'a'|'b';
REST: 'z';
DIGIT: [0-9];
STRING: ([A-Za-z'\'''\.'','])+;
NEWLINE: '\n' | '\r'('\n')?;
WHITESPACE: ' ' | '\t';

