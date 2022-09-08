<img alt="logo" src="https://www.objectionary.com/cactus.svg" height="100px" />

[![EO principles respected here](https://www.elegantobjects.org/badge.svg)](https://www.elegantobjects.org)
[![DevOps By Rultor.com](http://www.rultor.com/b/objectionary/eo-strings)](http://www.rultor.com/p/objectionary/eo-strings)
[![We recommend IntelliJ IDEA](https://www.elegantobjects.org/intellij-idea.svg)](https://www.jetbrains.com/idea/)

[![mvn](https://github.com/objectionary/eo-strings/actions/workflows/mvn.yml/badge.svg?branch=master)](https://github.com/objectionary/eo-strings/actions/workflows/mvn.yml)
[![PDD status](http://www.0pdd.com/svg?name=objectionary/eo-strings)](http://www.0pdd.com/p?name=objectionary/eo-strings)
[![codecov](https://codecov.io/gh/cqfn/eo/branch/master/graph/badge.svg)](https://codecov.io/gh/cqfn/eo)
[![Maven Central](https://img.shields.io/maven-central/v/org.eolang/eo-strings.svg)](https://maven-badges.herokuapp.com/maven-central/org.eolang/eo-strings)

[![Hits-of-Code](https://hitsofcode.com/github/objectionary/eo-strings)](https://hitsofcode.com/view/github/objectionary/eo-strings)
![Lines of code](https://img.shields.io/tokei/lines/github/objectionary/eo-strings)
[![License](https://img.shields.io/badge/license-MIT-green.svg)](https://github.com/objectionary/eo-strings/blob/master/LICENSE.txt)

[EO](https://www.eolang.org) objects for manipulations with strings.

This is how it works:

### Text
The object `QQ.txt.text` is a decorator of `QQ.string`.

The attribute `is-empty` is TRUE if the length of the
array is zero.

The attribute `trim` is a new string trimmed from both sides.

The attribute `joined` is a string that was obtained by concatenating
the strings from the array with the current string as a delimiter.

The attribute `contains` is TRUE if current string contains
`substr` as a substring.

The attribute `ends-with` is TRUE if current string 
ends with `substr`.

The attribute `starts-with` is TRUE if current string
starts with `substr`.

The attribute `index-of` is an index of `substr` in
current string as a substring.

The attribute `lower-case` is a new string in lower case.

The attribute `upper-case` is a new string in upper case.

The attribute `at` is a one sign from string by index.

The attribute `replaced` a new string where all substrings
`target` was changed to `replacement`.

The attribute `as-int` is an int object derived from the string.

The attribute `as-float` is a float object derived from the string.

The attribute `compare` is an int value -
result of comparing in lexicographic order.
Returns 0 if two strings are equal,
a negative number if the first string comes before the argument,
a positive number if the first string comes after the argument.


```
[] > text-test
  QQ.hamcrest.assert-that > @
    trim.
      text
        lower-case.
          text
            " AbC "
    $.equal-to "abc"
```

## How to Contribute

Fork repository, make changes, send us a pull request.
We will review your changes and apply them to the `master` branch shortly,
provided they don't violate our quality standards. To avoid frustration,
before sending us your pull request please run full Maven build:

```bash
$ mvn clean install -Pqulice
```

You will need Maven 3.3+ and Java 8+.


