# Add any ProGuard configurations specific to this
# extension here.

-keep public class com.bextdev.mprocedure.MProcedure {
    public *;
 }
-keeppackagenames gnu.kawa**, gnu.expr**

-optimizationpasses 4
-allowaccessmodification
-mergeinterfacesaggressively

-repackageclasses 'com/bextdev/mprocedure/repack'
-flattenpackagehierarchy
-dontpreverify
