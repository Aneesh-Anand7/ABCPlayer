/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Abc;
import Configuration;

root: body EOF;
body: (line)+;
line: ((element)+ NEWLINE) | bodyvoice | comment;
element: noteelem | tupletelem | barline | nthrepeat | WHITESPACE;

noteelem: note | multinote;
/* notes can be notes or rests */
note: noteorrest notelength?;
noteorrest: pitch | rest;
pitch: accidental? basenote octave?;
octave: ('\'')+ | (',')+;
notelength: (DIGIT+)? ('/' (DIGIT+)?)?;
/* ^ is sharp, _ is flat, = is neutral */
accidental: '^'|'^^'|'_'|'__'|'=';
basenote: 'C'|'D'|'E'|'F'|'G'|'A'|'B'|'c'|'d'|'e'|'f'|'g'|'a'|'b';
rest: 'z';
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

DIGIT: [0-9];
STRING: (.)+?;
NEWLINE: '\n' | '\r'('\n')?;
WHITESPACE: ' ' | '\t';

