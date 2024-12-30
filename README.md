# Groovy NullPointerException Handling

This repository demonstrates a common cause of `NullPointerException` errors in Groovy and how to effectively handle them.

The `bug.groovy` file shows code that throws a `NullPointerException` when attempting to call a method on a null object.  The `bugSolution.groovy` file provides the corrected code with robust null checks.

## Problem:

Groovy's dynamic typing allows for calling methods on objects without explicit type checking. This is convenient but can lead to runtime errors if an object is unexpectedly null. The example showcases how a method that handles null input correctly for a simple check fails to handle it when it's in the else part of a conditional statement.