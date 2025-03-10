# Prototype Pattern #

## Case ##
Let's say you need to copy another object but some of the fields are private.
You would not be able to clone it as your code depends on a concrete class.

## Objective ##
If you want to clone objects without coupling them to their concrete class then you would
use the prototype pattern. 

## Benefits ##
Prototype pattern is good for decoupling and reducing duplicate initialization code.

## Further improvements ##
It can be paired with a factory pattern to save object creation time by essentially caching it.
