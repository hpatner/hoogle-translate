(ns ht.data)

(def by-key-map
  {
"J@/ (insert)" {:lang "J" :algo "/ (insert)" :lib "-" :id 1 :doc "https://code.jsoftware.com/wiki/Vocabulary/slash" :sig "`TODO`"}
"APL@/ (reduce)" {:lang "APL" :algo "/ (reduce)" :lib "-" :id 1 :doc "http://microapl.com/apl_help/ch_020_020_800.htm" :sig "`TODO`"}
"C++@accumulate" {:lang "C++" :algo "accumulate" :lib "<numeric>" :id 1 :doc "https://en.cppreference.com/w/cpp/algorithm/accumulate" :sig "`TODO`"}
"C#@Aggregate" {:lang "C#" :algo "Aggregate" :lib "Enumerable" :id 1 :doc "https://docs.microsoft.com/en-us/dotnet/api/system.linq.enumerable.aggregate" :sig "`TODO`"}
"Rust@fold" {:lang "Rust" :algo "fold" :lib "trait.Iterator" :id 1 :doc "https://doc.rust-lang.org/std/iter/trait.Iterator.html#method.fold" :sig "`TODO`"}
"Haskell@foldl" {:lang "Haskell" :algo "foldl" :lib "Data.List" :id 1 :doc "https://hackage.haskell.org/package/base-4.12.0.0/docs/Prelude.html#v:foldl" :sig "`TODO`"}
"Racket@foldl" {:lang "Racket" :algo "foldl" :lib "base" :id 1 :doc "https://docs.racket-lang.org/reference/pairs.html#%28def._%28%28lib._racket%2Fprivate%2Flist..rkt%29._foldl%29%29" :sig "`TODO`"}
"q@over" {:lang "q" :algo "over" :lib "-" :id 1 :doc "https://code.kx.com/q/ref/over/" :sig "`TODO`"}
"C++@reduce" {:lang "C++" :algo "reduce" :lib "<numeric>" :id 1 :doc "https://en.cppreference.com/w/cpp/algorithm/reduce" :sig "`TODO`"}
"Clojure@reduce" {:lang "Clojure" :algo "reduce" :lib "core" :id 1 :doc "https://clojuredocs.org/clojure.core/reduce" :sig "`TODO`"}
"CUDA@reduce" {:lang "CUDA" :algo "reduce" :lib "Thrust" :id 1 :doc "https://thrust.github.io/doc/group__reductions_ga43eea9a000f912716189687306884fc7.html" :sig "`TODO`"}
"D@reduce" {:lang "D" :algo "reduce" :lib "algorithm.iteration" :id 1 :doc "https://dlang.org/library/std/algorithm/iteration/reduce.html" :sig "`TODO`"}
"Elixir@reduce" {:lang "Elixir" :algo "reduce" :lib "Enum" :id 1 :doc "https://hexdocs.pm/elixir/Enum.html#reduce/2" :sig "`TODO`"}
"Kotlin@reduce" {:lang "Kotlin" :algo "reduce" :lib "collections" :id 1 :doc "https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/reduce.html" :sig "`TODO`"}
"Python@reduce" {:lang "Python" :algo "reduce" :lib "itertools" :id 1 :doc "https://book.pythontips.com/en/latest/map_filter.html#reduce" :sig "`TODO`"}
"Ruby@reduce" {:lang "Ruby" :algo "reduce" :lib "Enumerable" :id 1 :doc "https://apidock.com/ruby/Enumerable/reduce" :sig "`TODO`"}
"APL@¨ (each)" {:lang "APL" :algo "¨ (each)" :lib "-" :id 2 :doc "http://microapl.com/apl_help/ch_020_020_900.htm" :sig "`TODO`"}
"J@each" {:lang "J" :algo "each" :lib "-" :id 2 :doc "https://www.jsoftware.com/help/primer/each.htm" :sig "`TODO`"}
"q@each" {:lang "q" :algo "each" :lib "-" :id 2 :doc "https://code.kx.com/q/ref/each/" :sig "`TODO`"}
"Clojure@map" {:lang "Clojure" :algo "map" :lib "core" :id 2 :doc "https://clojuredocs.org/clojure.core/map" :sig "`TODO`"}
"D@map" {:lang "D" :algo "map" :lib "algorithm.iteration" :id 2 :doc "https://dlang.org/library/std/algorithm/iteration/map.html" :sig "`TODO`"}
"Elixir@map" {:lang "Elixir" :algo "map" :lib "Enum" :id 2 :doc "https://hexdocs.pm/elixir/Enum.html#map/2" :sig "`TODO`"}
"Haskell@map" {:lang "Haskell" :algo "map" :lib "Data.List" :id 2 :doc "https://hackage.haskell.org/package/base-4.12.0.0/docs/Prelude.html#v:map" :sig "`TODO`"}
"Kotlin@map" {:lang "Kotlin" :algo "map" :lib "collections" :id 2 :doc "https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/map.html" :sig "`TODO`"}
"Python@map" {:lang "Python" :algo "map" :lib "builtin" :id 2 :doc "https://docs.python.org/3/library/functions.html#map" :sig "`TODO`"}
"Racket@map" {:lang "Racket" :algo "map" :lib "base" :id 2 :doc "https://docs.racket-lang.org/reference/pairs.html?q=map#%28def._%28%28lib._racket%2Fprivate%2Fmap..rkt%29._map%29%29" :sig "`TODO`"}
"Ruby@map" {:lang "Ruby" :algo "map" :lib "Enumerable" :id 2 :doc "https://apidock.com/ruby/Enumerable/map" :sig "`TODO`"}
"Rust@map" {:lang "Rust" :algo "map" :lib "trait.Iterator" :id 2 :doc "https://doc.rust-lang.org/std/iter/trait.Iterator.html#method.map" :sig "`TODO`"}
"Scala@map" {:lang "Scala" :algo "map" :lib "various" :id 2 :doc "https://www.scala-lang.org/api/2.12.4/scala/collection/immutable/Vector.html#map[B](f:A=%3EB):scala.collection.immutable.Vector[B]" :sig "`TODO`"}
"C++@transform" {:lang "C++" :algo "transform" :lib "<algorithm>" :id 2 :doc "https://en.cppreference.com/w/cpp/algorithm/transform" :sig "`TODO`"}
"APL@/ (compress)" {:lang "APL" :algo "/ (compress)" :lib "-" :id 3 :doc "http://microapl.com/apl_help/ch_020_020_840.htm" :sig "`TODO`"}
"Haskell@filter" {:lang "Haskell" :algo "filter" :lib "Data.List" :id 3 :doc "https://hackage.haskell.org/package/base-4.12.0.0/docs/Prelude.html#v:filter" :sig "`TODO`"}
"J@\\ (prefix)" {:lang "J" :algo "\\ (prefix)" :lib "-" :id 4 :doc "https://code.jsoftware.com/wiki/Vocabulary/bslash" :sig "`TODO`"}
"APL@\\ (scan)" {:lang "APL" :algo "\\ (scan)" :lib "-" :id 4 :doc "http://microapl.com/apl_help/ch_020_020_820.htm" :sig "`TODO`"}
"Python@accumulate" {:lang "Python" :algo "accumulate" :lib "itertools" :id 4 :doc "https://docs.python.org/3/library/itertools.html#itertools.accumulate" :sig "`TODO`"}
"D@cumulativeFold" {:lang "D" :algo "cumulativeFold" :lib "algorithm.iteration" :id 4 :doc "https://dlang.org/library/std/algorithm/iteration/cumulative_fold.html" :sig "`TODO`"}
"C++@inclusive_scan" {:lang "C++" :algo "inclusive_scan" :lib "<numeric>" :id 4 :doc "https://en.cppreference.com/w/cpp/algorithm/inclusive_scan" :sig "`TODO`"}
"CUDA@inclusive_scan" {:lang "CUDA" :algo "inclusive_scan" :lib "Thrust" :id 4 :doc "https://thrust.github.io/doc/group__prefixsums_gafb24ad76101263038b0acaddc094d70a.html" :sig "`TODO`"}
"C++@partial_sum" {:lang "C++" :algo "partial_sum" :lib "<numeric>" :id 4 :doc "https://en.cppreference.com/w/cpp/algorithm/partial_sum" :sig "`TODO`"}
"Clojure@reductions" {:lang "Clojure" :algo "reductions" :lib "core" :id 4 :doc "https://clojuredocs.org/clojure.core/reductions" :sig "`TODO`"}
"q@scan" {:lang "q" :algo "scan" :lib "-" :id 4 :doc "https://code.kx.com/q/ref/over/" :sig "`TODO`"}
"Rust@scan" {:lang "Rust" :algo "scan" :lib "trait.Iterator" :id 4 :doc "https://doc.rust-lang.org/std/iter/trait.Iterator.html#method.scan" :sig "`TODO`"}
"Scala@scan" {:lang "Scala" :algo "scan" :lib "various" :id 4 :doc "https://www.scala-lang.org/api/2.12.4/scala/collection/immutable/Vector.html#scan[B%3E:A,That](z:B)(op:(B,B)=%3EB)(implicitcbf:scala.collection.generic.CanBuildFrom[Repr,B,That]):That" :sig "`TODO`"}
"Kotlin@runningReduce" {:lang "Kotlin" :algo "runningReduce" :lib "collections" :id 4 :doc "https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/running-reduce.html" :sig "`TODO`"}
"F#@scan" {:lang "F#" :algo "scan" :lib "Seq" :id 4 :doc "https://docs.microsoft.com/en-us/dotnet/fsharp/language-reference/sequences" :sig "`TODO`"}
"Elixir@scan" {:lang "Elixir" :algo "scan" :lib "Enum" :id 4 :doc "https://hexdocs.pm/elixir/Enum.html#scan/2" :sig "`TODO`"}
"Haskell@scanl1" {:lang "Haskell" :algo "scanl1" :lib "Data.List" :id 4 :doc "https://hackage.haskell.org/package/base-4.12.0.0/docs/Prelude.html#v:scanl1" :sig "`TODO`"}
"RAPIDS (C++)@scan" {:lang "RAPIDS (C++)" :algo "scan" :lib "Series" :id 4 :doc "https://docs.rapids.ai/api/libcudf/stable/namespacecudf_1_1experimental.html#a3fb513cb9b4c26c11309b8b7c957724a" :sig "`TODO`"}
"RAPIDS (Python)@cumsum" {:lang "RAPIDS (Python)" :algo "cumsum" :lib "Series" :id 4 :doc "https://docs.rapids.ai/api/cudf/nightly/api.html#cudf.core.series.Series.cumsum" :sig "`TODO`"}
"pandas@cumsum" {:lang "pandas" :algo "cumsum" :lib "Series" :id 4 :doc "https://pandas.pydata.org/pandas-docs/stable/reference/api/pandas.Series.cumsum.html?highlight=cumsum#pandas.Series.cumsum" :sig "`TODO`"}
"APL@/ (n-wise reduce)" {:lang "APL" :algo "/ (n-wise reduce)" :lib "-" :id 5 :doc "http://microapl.com/apl_help/ch_020_020_800.htm" :sig "`TODO`"}
"C++@adjacent_difference" {:lang "C++" :algo "adjacent_difference" :lib "<numeric>" :id 5 :doc "https://en.cppreference.com/w/cpp/algorithm/adjacent_difference" :sig "`TODO`"}
"CUDA@adjacent_difference" {:lang "CUDA" :algo "adjacent_difference" :lib "Thrust" :id 5 :doc "https://thrust.github.io/doc/group__transformations_gaa41d309b53fa03bf13fe35a184148400.html" :sig "`TODO`"}
"Haskell@mapAdjacent" {:lang "Haskell" :algo "mapAdjacent" :lib "Data.List.HT" :id 5 :doc "https://hackage.haskell.org/package/utility-ht-0.0.15/docs/Data-List-HT.html#v:mapAdjacent" :sig "`TODO`"}
"q@prior" {:lang "q" :algo "prior" :lib "-" :id 5 :doc "https://code.kx.com/q/ref/prior/" :sig "`TODO`"}
"Kotlin@zipWithNext" {:lang "Kotlin" :algo "zipWithNext" :lib "collections" :id 5 :doc "https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/zip-with-next.html" :sig "`TODO`"}
"APL@∘. (outer product)" {:lang "APL" :algo "∘. (outer product)" :lib "-" :id 6 :doc "http://microapl.com/apl_help/ch_020_020_890.htm" :sig "`TODO`"}
"Haskell@outerProduct" {:lang "Haskell" :algo "outerProduct" :lib "Data.List.HT" :id 6 :doc "https://hackage.haskell.org/package/utility-ht-0.0.15/docs/Data-List-HT.html#v:outerProduct" :sig "`TODO`"}
"Clojure@outer-product" {:lang "Clojure" :algo "outer-product" :lib "core.matrix" :id 6 :doc "https://mikera.github.io/core.matrix/doc/clojure.core.matrix.html#var-outer-product" :sig "`TODO`"}
"APL@. (inner product)" {:lang "APL" :algo ". (inner product)" :lib "-" :id 7 :doc "http://microapl.com/apl_help/ch_020_020_880.htm" :sig "`TODO`"}
"C++@inner_product" {:lang "C++" :algo "inner_product" :lib "<numeric>" :id 7 :doc "https://en.cppreference.com/w/cpp/algorithm/inner_product" :sig "`TODO`"}
"Rust@.. / Range" {:lang "Rust" :algo ".. / Range" :lib "ops" :id 8 :doc "https://doc.rust-lang.org/std/ops/struct.Range.html" :sig "`TODO`"}
"APL@⍳ (index generator)" {:lang "APL" :algo "⍳ (index generator)" :lib "-" :id 8 :doc "http://microapl.com/apl_help/ch_020_020_150.htm" :sig "`TODO`"}
"J@i. (integers)" {:lang "J" :algo "i. (integers)" :lib "-" :id 8 :doc "https://code.jsoftware.com/wiki/Vocabulary/idot" :sig "`TODO`"}
"C++@iota" {:lang "C++" :algo "iota" :lib "<numeric>" :id 8 :doc "https://en.cppreference.com/w/cpp/algorithm/iota" :sig "`TODO`"}
"D@iota" {:lang "D" :algo "iota" :lib "range" :id 8 :doc "https://dlang.org/library/std/range/iota.html" :sig "`TODO`"}
"Go@iota" {:lang "Go" :algo "iota" :lib "-" :id 8 :doc "https://github.com/golang/go/wiki/Iota" :sig "`TODO`"}
"Clojure@range" {:lang "Clojure" :algo "range" :lib "core" :id 8 :doc "https://clojuredocs.org/clojure.core/range" :sig "`TODO`"}
"Haskell@range" {:lang "Haskell" :algo "range" :lib "Data.List.HT" :id 8 :doc "https://hackage.haskell.org/package/utility-ht-0.0.15/docs/Data-List-HT.html#v:range" :sig "`TODO`"}
"Python@range" {:lang "Python" :algo "range" :lib "-" :id 8 :doc "https://docs.python.org/3/library/functions.html#func-range" :sig "`TODO`"}
"Racket@range" {:lang "Racket" :algo "range" :lib "base" :id 8 :doc "https://docs.racket-lang.org/reference/pairs.html?q=enumerate#%28def._%28%28lib._racket%2Flist..rkt%29._range%29%29" :sig "`TODO`"}
"CUDA@sequence" {:lang "CUDA" :algo "sequence" :lib "Thrust" :id 8 :doc "https://thrust.github.io/doc/group__transformations_ga233a3db0c5031023c8e9385acd4b9759.html" :sig "`TODO`"}
"q@til" {:lang "q" :algo "til" :lib "-" :id 8 :doc "https://code.kx.com/q/ref/til/" :sig "`TODO`"}
"Scala@until" {:lang "Scala" :algo "until" :lib "Range" :id 8 :doc "https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/Range.html" :sig "`TODO`"}
"D@enumerate" {:lang "D" :algo "enumerate" :lib "range" :id 9 :doc "https://dlang.org/library/std/range/enumerate.html" :sig "`TODO`"}
"Python@enumerate" {:lang "Python" :algo "enumerate" :lib "-" :id 9 :doc "http://book.pythontips.com/en/latest/enumerate.html" :sig "`TODO`"}
"Racket@enumerate" {:lang "Racket" :algo "enumerate" :lib "list-utils" :id 9 :doc "https://docs.racket-lang.org/list-utils/index.html?q=freq#%28def._%28%28lib._list-utils%2Fmain..rkt%29._enumerate%29%29" :sig "`TODO`"}
"Rust@enumerate" {:lang "Rust" :algo "enumerate" :lib "trait.Iterator" :id 9 :doc "https://doc.rust-lang.org/std/iter/trait.Iterator.html#method.enumerate" :sig "`TODO`"}
"Haskell@indexed" {:lang "Haskell" :algo "indexed" :lib "Data.List.Index" :id 9 :doc "https://hackage.haskell.org/package/ilist-0.4.0.0/docs/Data-List-Index.html#v:indexed" :sig "`TODO`"}
"Racket@indexed" {:lang "Racket" :algo "indexed" :lib "data-collections" :id 9 :doc "https://docs.racket-lang.org/collections/collections-api.html?q=chunk-while#%28def._%28%28lib._data%2Fcollection..rkt%29._indexed%29%29" :sig "`TODO`"}
"Clojure@map-indexed*" {:lang "Clojure" :algo "map-indexed*" :lib "core" :id 9 :doc "https://clojuredocs.org/clojure.core/map-indexed" :sig "`TODO`"}
"C#@Select" {:lang "C#" :algo "Select" :lib "Enumerable" :id 9 :doc "https://docs.microsoft.com/en-us/dotnet/api/system.linq.enumerable.select" :sig "`TODO`"}
"Elixir@with_index" {:lang "Elixir" :algo "with_index" :lib "Enum" :id 9 :doc "https://hexdocs.pm/elixir/Enum.html#with_index/2" :sig "`TODO`"}
"Ruby@with_index" {:lang "Ruby" :algo "with_index" :lib "Enumerable" :id 9 :doc "https://apidock.com/ruby/Enumerator/with_index" :sig "`TODO`"}
"Kotlin@withIndex" {:lang "Kotlin" :algo "withIndex" :lib "collections" :id 9 :doc "https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/with-index.html" :sig "`TODO`"}
"Scala@zipWithIndex" {:lang "Scala" :algo "zipWithIndex" :lib "various" :id 9 :doc "https://www.scala-lang.org/api/2.12.4/scala/collection/immutable/Vector.html#zipWithIndex:scala.collection.immutable.Vector[(A,Int)]" :sig "`TODO`"}
"Haskell@partition" {:lang "Haskell" :algo "partition" :lib "Data.List" :id 10 :doc "https://hackage.haskell.org/package/base-4.12.0.0/docs/Data-List.html#v:partition" :sig "`TODO`"}
"Kotlin@partition" {:lang "Kotlin" :algo "partition" :lib "collections" :id 10 :doc "https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/partition.html" :sig "`TODO`"}
"Racket@partition" {:lang "Racket" :algo "partition" :lib "base" :id 10 :doc "https://docs.racket-lang.org/reference/pairs.html#%28def._%28%28lib._racket%2Flist..rkt%29._partition%29%29" :sig "`TODO`"}
"Ruby@partition" {:lang "Ruby" :algo "partition" :lib "Enumerable" :id 10 :doc "https://apidock.com/ruby/Enumerable/partition" :sig "`TODO`"}
"Rust@partition" {:lang "Rust" :algo "partition" :lib "trait.Iterator" :id 10 :doc "https://doc.rust-lang.org/std/iter/trait.Iterator.html#method.partition" :sig "`TODO`"}
"C++@partition_copy" {:lang "C++" :algo "partition_copy" :lib "<algorithm>" :id 10 :doc "https://en.cppreference.com/w/cpp/algorithm/partition_copy" :sig "`TODO`"}
"Elixir@split_with" {:lang "Elixir" :algo "split_with" :lib "Enum" :id 10 :doc "https://hexdocs.pm/elixir/Enum.html#split_with/2" :sig "`TODO`"}
"Clojure@partition" {:lang "Clojure" :algo "partition" :lib "core" :id 11 :doc "https://clojuredocs.org/clojure.core/partition" :sig "`TODO`"}
"C++@partition" {:lang "C++" :algo "partition" :lib "<algorithm>" :id 13 :doc "https://en.cppreference.com/w/cpp/algorithm/partition" :sig "`TODO`"}
"CUDA@partition" {:lang "CUDA" :algo "partition" :lib "Thrust" :id 13 :doc "https://thrust.github.io/doc/group__partitioning_gac5cdbb402c5473ca92e95bc73ecaf13c.html" :sig "`TODO`"}
"D@partition" {:lang "D" :algo "partition" :lib "algorithm.sorting" :id 13 :doc "https://dlang.org/library/std/algorithm/sorting/partition.html" :sig "`TODO`"}
"BASH@uniq" {:lang "BASH" :algo "uniq" :lib "-" :id 14 :doc "https://ss64.com/bash/uniq.html" :sig "`TODO`"}
"D@uniq" {:lang "D" :algo "uniq" :lib "algorithm.iteration" :id 14 :doc "https://dlang.org/phobos/std_algorithm_iteration.html#uniq" :sig "`TODO`"}
"C++@unique" {:lang "C++" :algo "unique" :lib "<algorithm>" :id 14 :doc "https://en.cppreference.com/w/cpp/algorithm/unique" :sig "`TODO`"}
"C#@Distinct" {:lang "C#" :algo "Distinct" :lib "Enumerable" :id 15 :doc "https://docs.microsoft.com/en-us/dotnet/api/system.linq.enumerable.distinct" :sig "`TODO`"}
"Clojure@distinct" {:lang "Clojure" :algo "distinct" :lib "core" :id 15 :doc "https://clojuredocs.org/clojure.core/distinct" :sig "`TODO`"}
"F#@Distinct" {:lang "F#" :algo "Distinct" :lib "Seq" :id 15 :doc "https://www.dotnetperls.com/duplicates-fs" :sig "`TODO`"}
"Kotlin@distinct" {:lang "Kotlin" :algo "distinct" :lib "collections" :id 15 :doc "https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/distinct.html" :sig "`TODO`"}
"Scala@distinct" {:lang "Scala" :algo "distinct" :lib "various" :id 15 :doc "https://www.scala-lang.org/api/2.12.4/scala/collection/immutable/Vector.html#distinct:Repr" :sig "`TODO`"}
"Haskell@sortUniq" {:lang "Haskell" :algo "sortUniq" :lib "Data.List.Unique" :id 15 :doc "https://hackage.haskell.org/package/Unique-0.4.7.7/docs/Data-List-Unique.html#v:sortUniq" :sig "`TODO`"}
"Elixir@uniq" {:lang "Elixir" :algo "uniq" :lib "Enum" :id 15 :doc "https://hexdocs.pm/elixir/Enum.html#uniq/1" :sig "`TODO`"}
"Ruby@uniq" {:lang "Ruby" :algo "uniq" :lib "Array" :id 15 :doc "https://apidock.com/ruby/Array/uniq" :sig "`TODO`"}
"Rust@unique" {:lang "Rust" :algo "unique" :lib "itertools" :id 15 :doc "https://docs.rs/itertools/0.7.6/itertools/structs/struct.Unique.html" :sig "`TODO`"}
"J@\": (default format)" {:lang "J" :algo "\": (default format)" :lib "-" :id 16 :doc "https://code.jsoftware.com/wiki/Vocabulary/quoteco" :sig "`TODO`"}
"APL@⍕ (format)" {:lang "APL" :algo "⍕ (format)" :lib "-" :id 16 :doc "http://microapl.com/apl_help/ch_020_020_680.htm" :sig "`TODO`"}
"Haskell@show" {:lang "Haskell" :algo "show" :lib "Prelude" :id 16 :doc "https://hackage.haskell.org/package/base-4.12.0.0/docs/Prelude.html#v:show" :sig "`TODO`"}
"Clojure@str" {:lang "Clojure" :algo "str" :lib "core" :id 16 :doc "https://clojuredocs.org/clojure.core/str" :sig "`TODO`"}
"Python@str" {:lang "Python" :algo "str" :lib "-" :id 16 :doc "https://docs.python.org/3/library/stdtypes.html#text-sequence-type-str" :sig "`TODO`"}
"q@string" {:lang "q" :algo "string" :lib "-" :id 16 :doc "https://code.kx.com/v2/ref/string/" :sig "`TODO`"}
"C++@to_string" {:lang "C++" :algo "to_string" :lib "<string>" :id 16 :doc "https://en.cppreference.com/w/cpp/string/basic_string/to_string" :sig "`TODO`"}
"Elixir@to_string" {:lang "Elixir" :algo "to_string" :lib "various" :id 16 :doc "https://hexdocs.pm/elixir/Integer.html#to_string/1" :sig "`TODO`"}
"Rust@to_string" {:lang "Rust" :algo "to_string" :lib "string" :id 16 :doc "https://doc.rust-lang.org/std/string/trait.ToString.html" :sig "`TODO`"}
"Scala@toString" {:lang "Scala" :algo "toString" :lib "various" :id 16 :doc "https://www.scala-lang.org/api/2.12.4/scala/collection/immutable/Vector.html#toString():String" :sig "`TODO`"}
"D@canFind" {:lang "D" :algo "canFind" :lib "algorithm.searching" :id 17 :doc "https://dlang.org/library/std/algorithm/searching/can_find.can_find.html" :sig "`TODO`"}
"Kotlin@contains" {:lang "Kotlin" :algo "contains" :lib "collections" :id 17 :doc "https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/contains.html" :sig "`TODO`"}
"Scala@contains" {:lang "Scala" :algo "contains" :lib "various" :id 17 :doc "https://www.scala-lang.org/api/2.12.4/scala/collection/immutable/Vector.html#contains[A1%3E:A](elem:A1):Boolean" :sig "`TODO`"}
"Clojure@contains?" {:lang "Clojure" :algo "contains?" :lib "core" :id 17 :doc "https://clojuredocs.org/clojure.core/contains_q" :sig "`TODO`"}
"Haskell@elem" {:lang "Haskell" :algo "elem" :lib "Prelude" :id 17 :doc "https://hackage.haskell.org/package/base-4.12.0.0/docs/Prelude.html#v:elem" :sig "`TODO`"}
"Python@in" {:lang "Python" :algo "in" :lib "keyword" :id 17 :doc "https://www.programiz.com/python-programming/keyword-list#in" :sig "`TODO`"}
"Ruby@include?" {:lang "Ruby" :algo "include?" :lib "various" :id 17 :doc "https://apidock.com/ruby/Array/include%3F" :sig "`TODO`"}
"Racket@member*" {:lang "Racket" :algo "member*" :lib "base" :id 17 :doc "https://docs.racket-lang.org/reference/pairs.html?q=map#%28def._%28%28lib._racket%2Fprivate%2Fbase..rkt%29._member%29%29" :sig "`TODO`"}
"Elixir@member?" {:lang "Elixir" :algo "member?" :lib "Enum" :id 17 :doc "https://hexdocs.pm/elixir/Enum.html#member?/2" :sig "`TODO`"}
"APL@⍸ (where)" {:lang "APL" :algo "⍸ (where)" :lib "-" :id 18 :doc "https://help.dyalog.com/17.1/#Language/Primitive%20Functions/Where.htm#kanchor3608" :sig "`TODO`"}
"q@where" {:lang "q" :algo "where" :lib "-" :id 18 :doc "https://code.kx.com/q4m3/A_Built-in_Functions/#a107-where" :sig "`TODO`"}
"Haskell@count" {:lang "Haskell" :algo "count" :lib "Data.List.Unique" :id 19 :doc "https://hackage.haskell.org/package/Unique-0.4.7.7/docs/Data-List-Unique.html#v:count" :sig "`TODO`"}
"Python@Counter*" {:lang "Python" :algo "Counter*" :lib "collections" :id 19 :doc "https://docs.python.org/2/library/collections.html#collections.Counter" :sig "`TODO`"}
"Clojure@frequencies" {:lang "Clojure" :algo "frequencies" :lib "core" :id 19 :doc "https://clojuredocs.org/clojure.core/frequencies" :sig "`TODO`"}
"Racket@frequencies" {:lang "Racket" :algo "frequencies" :lib "list-utils" :id 19 :doc "https://docs.racket-lang.org/list-utils/index.html?q=freq#%28def._%28%28lib._list-utils%2Fmain..rkt%29._frequencies%29%29" :sig "`TODO`"}
"pandas@value_counts" {:lang "pandas" :algo "value_counts" :lib "Series" :id 19 :doc "https://pandas.pydata.org/pandas-docs/stable/reference/api/pandas.Series.value_counts.html" :sig "`TODO`"}
"D@any" {:lang "D" :algo "any" :lib "algorithm.searching" :id 20 :doc "https://dlang.org/library/std/algorithm/searching/any.html" :sig "`TODO`"}
"Haskell@any" {:lang "Haskell" :algo "any" :lib "Prelude" :id 20 :doc "https://hackage.haskell.org/package/base-4.12.0.0/docs/Prelude.html#v:any" :sig "`TODO`"}
"Kotlin@any" {:lang "Kotlin" :algo "any" :lib "collections" :id 20 :doc "https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/any.html" :sig "`TODO`"}
"Python@any" {:lang "Python" :algo "any" :lib "builtin" :id 20 :doc "https://docs.python.org/3/library/functions.html#any" :sig "`TODO`"}
"Rust@any" {:lang "Rust" :algo "any" :lib "trait.Iterator" :id 20 :doc "https://doc.rust-lang.org/std/iter/trait.Iterator.html#method.any" :sig "`TODO`"}
"Elixir@any?" {:lang "Elixir" :algo "any?" :lib "Enum" :id 20 :doc "https://hexdocs.pm/elixir/Enum.html#any?/2" :sig "`TODO`"}
"Ruby@any?" {:lang "Ruby" :algo "any?" :lib "Enumerable" :id 20 :doc "https://apidock.com/ruby/Enumerable/any%3F" :sig "`TODO`"}
"C++@any_of" {:lang "C++" :algo "any_of" :lib "<algorithm>" :id 20 :doc "https://en.cppreference.com/w/cpp/algorithm/all_any_none_of" :sig "`TODO`"}
"F#@exists" {:lang "F#" :algo "exists" :lib "List" :id 20 :doc "https://docs.microsoft.com/en-us/dotnet/fsharp/language-reference/lists" :sig "`TODO`"}
"Scala@exists" {:lang "Scala" :algo "exists" :lib "various" :id 20 :doc "https://www.scala-lang.org/api/2.12.4/scala/collection/immutable/Vector.html" :sig "`TODO`"}
"Racket@memf*" {:lang "Racket" :algo "memf*" :lib "base" :id 20 :doc "https://docs.racket-lang.org/reference/pairs.html#%28def._%28%28lib._racket%2Fprivate%2Flist..rkt%29._memf%29%29" :sig "`TODO`"}
"Clojure@some" {:lang "Clojure" :algo "some" :lib "core" :id 20 :doc "https://clojuredocs.org/clojure.core/some" :sig "`TODO`"}
"APL@, (catenate)" {:lang "APL" :algo ", (catenate)" :lib "-" :id 21 :doc "http://microapl.com/apl_help/ch_020_020_490.htm" :sig "`TODO`"}
"Haskell@concat" {:lang "Haskell" :algo "concat" :lib "Prelude" :id 21 :doc "https://hackage.haskell.org/package/base-4.12.0.0/docs/Prelude.html#v:concat" :sig "`TODO`"}
"Racket@join" {:lang "Racket" :algo "join" :lib "base" :id 21 :doc "https://docs.racket-lang.org/algebraic/class_base.html?q=some#%28def._%28%28lib._algebraic%2Fcontrol%2Fmonad..rkt%29._join%29%29" :sig "`TODO`"}
"Ruby@join" {:lang "Ruby" :algo "join" :lib "various" :id 21 :doc "https://apidock.com/ruby/Array/join" :sig "`TODO`"}
"Clojure@join" {:lang "Clojure" :algo "join" :lib "string" :id 21 :doc "https://clojuredocs.org/clojure.string/join" :sig "`TODO`"}
"D@join" {:lang "D" :algo "join" :lib "array" :id 21 :doc "https://dlang.org/library/std/array/join.html" :sig "`TODO`"}
"Rust@join" {:lang "Rust" :algo "join" :lib "Vec" :id 21 :doc "https://doc.rust-lang.org/std/vec/struct.Vec.html#method.join" :sig "`TODO`"}
"Go@join" {:lang "Go" :algo "join" :lib "strings" :id 21 :doc "https://golang.org/pkg/strings/#Join" :sig "`TODO`"}
"C#@join" {:lang "C#" :algo "join" :lib "String" :id 21 :doc "https://docs.microsoft.com/en-us/dotnet/api/system.string.join?view=netframework-4.8" :sig "`TODO`"}
"F#@join" {:lang "F#" :algo "join" :lib "String" :id 21 :doc "https://docs.microsoft.com/en-us/dotnet/api/system.string.join?view=netframework-4.8" :sig "`TODO`"}
"Python@join*" {:lang "Python" :algo "join*" :lib "String" :id 21 :doc "https://www.w3schools.com/python/ref_string_join.asp" :sig "`TODO`"}
"Kotlin@joinTo" {:lang "Kotlin" :algo "joinTo" :lib "collections" :id 21 :doc "https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/join-to.html" :sig "`TODO`"}
"Python@zip(*)" {:lang "Python" :algo "zip(*)" :lib "-" :id 22 :doc "https://www.geeksforgeeks.org/transpose-matrix-single-line-python/" :sig "`TODO`"}
"pandas@transpose" {:lang "pandas" :algo "transpose" :lib "DataFrame" :id 22 :doc "https://pandas.pydata.org/pandas-docs/stable/reference/api/pandas.DataFrame.transpose.html" :sig "`TODO`"}
"Ruby@transpose" {:lang "Ruby" :algo "transpose" :lib "Array" :id 22 :doc "https://apidock.com/ruby/Array/transpose" :sig "`TODO`"}
"APL@⍉ (transpose)" {:lang "APL" :algo "⍉ (transpose)" :lib "-" :id 22 :doc "http://microapl.com/apl_help/ch_020_020_540.htm" :sig "`TODO`"}
"Haskell@transpose" {:lang "Haskell" :algo "transpose" :lib "Data.List" :id 22 :doc "https://hackage.haskell.org/package/base-4.12.0.0/docs/Data-List.html#v:transpose" :sig "`TODO`"}
"q@flip" {:lang "q" :algo "flip" :lib "- " :id 22 :doc "https://code.kx.com/v2/ref/flip/" :sig "`TODO`"}
"Clojure@transpose" {:lang "Clojure" :algo "transpose" :lib "core.matrix" :id 22 :doc "https://mikera.github.io/core.matrix/doc/clojure.core.matrix.html#var-transpose" :sig "`TODO`"}
"Elixir@transpose" {:lang "Elixir" :algo "transpose" :lib "Matrix" :id 22 :doc "https://hexdocs.pm/matrix/Matrix.html#transpose/1" :sig "`TODO`"}
"Scala@transpose" {:lang "Scala" :algo "transpose" :lib "various" :id 22 :doc "https://www.scala-lang.org/api/2.12.4/scala/collection/immutable/Vector.html#transpose" :sig "`TODO`"}
"D@transposed" {:lang "D" :algo "transposed" :lib "range" :id 22 :doc "https://dlang.org/library/std/range/transposed.html" :sig "`TODO`"}
"RAPIDS (Python)@transpose" {:lang "RAPIDS (Python)" :algo "transpose" :lib "DataFrame" :id 22 :doc "https://docs.rapids.ai/api/cudf/stable/api.html#cudf.core.dataframe.DataFrame.transpose" :sig "`TODO`"}
"APL@⊆ (partition)" {:lang "APL" :algo "⊆ (partition)" :lib "-" :id 23 :doc "http://microapl.com/apl_help/ch_020_020_590.htm" :sig "`TODO`"}
"Haskell@groupBy" {:lang "Haskell" :algo "groupBy" :lib "Data.List.HT" :id 23 :doc "https://hackage.haskell.org/package/utility-ht-0.0.15/docs/Data-List-HT.html#v:groupBy" :sig "`TODO`"}
"Clojure@partition-by" {:lang "Clojure" :algo "partition-by" :lib "core" :id 23 :doc "https://clojuredocs.org/clojure.core/partition-by" :sig "`TODO`"}
"Ruby@chunk_while" {:lang "Ruby" :algo "chunk_while" :lib "Enumerable" :id 23 :doc "https://apidock.com/ruby/Enumerable/chunk_while" :sig "`TODO`"}
"D@chunkBy" {:lang "D" :algo "chunkBy" :lib "algorith.iteration" :id 23 :doc "https://dlang.org/library/std/algorithm/iteration/chunk_by.html" :sig "`TODO`"}
"Elixir@chunk_while" {:lang "Elixir" :algo "chunk_while" :lib "Enum" :id 23 :doc "https://hexdocs.pm/elixir/Enum.html#chunk_while/4" :sig "`TODO`"}
"Ruby@slice_when" {:lang "Ruby" :algo "slice_when" :lib "Enumerable" :id 23 :doc "https://apidock.com/ruby/v2_5_5/Enumerable/slice_when" :sig "`TODO`"}
"C++@chunk_by" {:lang "C++" :algo "chunk_by" :lib "range-v3" :id 23 :doc "https://ericniebler.github.io/range-v3/index.html#tutorial-views" :sig "`TODO`"}
"C++@chunk__by" {:lang "C++" :algo "chunk__by" :lib "<ranges>" :id 23 :doc "https://en.cppreference.com/w/cpp/ranges/chunk_by_view" :sig "`TODO`"}
"Haskell@repeat" {:lang "Haskell" :algo "repeat" :lib "Prelude" :id 24 :doc "https://hackage.haskell.org/package/base-4.14.0.0/docs/Prelude.html#v:repeat" :sig "`TODO`"}
"Clojure@repeat" {:lang "Clojure" :algo "repeat" :lib "core" :id 24 :doc "https://clojuredocs.org/clojure.core/repeat" :sig "`TODO`"}
"C++@repeat" {:lang "C++" :algo "repeat" :lib "range-v3" :id 24 :doc "https://ericniebler.github.io/range-v3/index.html#tutorial-views" :sig "`TODO`"}
"D@repeat" {:lang "D" :algo "repeat" :lib "range" :id 24 :doc "https://dlang.org/library/std/range/repeat.html" :sig "`TODO`"}
"Rust@repeat" {:lang "Rust" :algo "repeat" :lib "Iter" :id 24 :doc "https://doc.rust-lang.org/std/iter/struct.Repeat.html" :sig "`TODO`"}
"Haskell@replicate" {:lang "Haskell" :algo "replicate" :lib "Prelude" :id 25 :doc "https://hackage.haskell.org/package/base-4.14.0.0/docs/Prelude.html#v:replicate" :sig "`TODO`"}
"C++@repeat_n" {:lang "C++" :algo "repeat_n" :lib "range-v3" :id 25 :doc "https://ericniebler.github.io/range-v3/index.html#tutorial-views" :sig "`TODO`"}
"C#@repeat" {:lang "C#" :algo "repeat" :lib "Enumerable" :id 25 :doc "https://docs.microsoft.com/en-us/dotnet/api/system.linq.enumerable.repeat?view=netcore-3.1" :sig "`TODO`"}
"APL@\\ (expand)" {:lang "APL" :algo "\\ (expand)" :lib "-" :id 25 :doc "http://microapl.com/apl_help/ch_020_020_860.htm" :sig "`TODO`"}
"C++@transform*" {:lang "C++" :algo "transform*" :lib "<algorithm>" :id 30 :doc "https://en.cppreference.com/w/cpp/algorithm/transform" :sig "`TODO`"}
"Haskell@zipWith" {:lang "Haskell" :algo "zipWith" :lib "Prelude" :id 30 :doc "https://hackage.haskell.org/package/base-4.14.0.0/docs/Prelude.html#v:zipWith" :sig "`TODO`"}
"Clojure@map*" {:lang "Clojure" :algo "map*" :lib "core" :id 30 :doc "https://clojuredocs.org/clojure.core/map" :sig "`TODO`"}
"Racket@map*" {:lang "Racket" :algo "map*" :lib "base" :id 30 :doc "https://docs.racket-lang.org/reference/pairs.html#%28def._%28%28lib._racket%2Fprivate%2Fmap..rkt%29._map%29%29" :sig "`TODO`"}
"OCaml@map2" {:lang "OCaml" :algo "map2" :lib "List" :id 30 :doc "https://caml.inria.fr/pub/docs/manual-ocaml/libref/List.html" :sig "`TODO`"}
"F#@map2" {:lang "F#" :algo "map2" :lib "Seq" :id 30 :doc "https://msdn.microsoft.com/visualfsharpdocs/conceptual/list.map2%5b%27t1%2c%27t2%2c%27u%5d-function-%5bfsharp%5d" :sig "`TODO`"}
"C++@filter" {:lang "C++" :algo "filter" :lib "range-v3" :id 3 :doc "https://ericniebler.github.io/range-v3/index.html#tutorial-views" :sig "`TODO`"}
"C#@Where" {:lang "C#" :algo "Where" :lib "Enumerable" :id 3 :doc "https://docs.microsoft.com/en-us/dotnet/api/system.linq.enumerable.where?view=netcore-3.1" :sig "`TODO`"}
"J@copy" {:lang "J" :algo "copy" :lib "-" :id 3 :doc "https://code.jsoftware.com/wiki/Vocabulary/number#dyadic" :sig "`TODO`"}
"Java@filter" {:lang "Java" :algo "filter" :lib "Streams" :id 3 :doc "https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html#filter-java.util.function.Predicate-" :sig "`TODO`"}
"OCaml@filter" {:lang "OCaml" :algo "filter" :lib "List" :id 3 :doc "https://ocaml.org/releases/4.10/htmlman/libref/List.html" :sig "`TODO`"}
"Clojure@filter" {:lang "Clojure" :algo "filter" :lib "core" :id 3 :doc "https://clojuredocs.org/clojure.core/filter" :sig "`TODO`"}
"Racket@filter" {:lang "Racket" :algo "filter" :lib "base" :id 3 :doc "https://docs.racket-lang.org/reference/pairs.html?q=filter#%28def._%28%28lib._racket%2Fprivate%2Flist..rkt%29._filter%29%29" :sig "`TODO`"}
"F#@filter" {:lang "F#" :algo "filter" :lib "List" :id 3 :doc "https://msdn.microsoft.com/visualfsharpdocs/conceptual/list.filter%5b%27t%5d-function-%5bfsharp%5d" :sig "`TODO`"}
"D@filter" {:lang "D" :algo "filter" :lib "algorithm" :id 3 :doc "https://dlang.org/library/std/algorithm/iteration/filter.html" :sig "`TODO`"}
"Ruby@filter" {:lang "Ruby" :algo "filter" :lib "Array" :id 3 :doc "https://apidock.com/ruby/Array/filter" :sig "`TODO`"}
"Python@filter" {:lang "Python" :algo "filter" :lib "-" :id 3 :doc "https://docs.python.org/3/library/functions.html#filter" :sig "`TODO`"}
"Kotlin@filter" {:lang "Kotlin" :algo "filter" :lib "collections" :id 3 :doc "https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/filter.html" :sig "`TODO`"}
"Scala@filter" {:lang "Scala" :algo "filter" :lib "various" :id 3 :doc "https://www.scala-lang.org/api/2.12.4/scala/collection/immutable/Vector.html#filter(p:A=%3EBoolean):Repr" :sig "`TODO`"}
"Rust@filter" {:lang "Rust" :algo "filter" :lib "iter" :id 3 :doc "https://doc.rust-lang.org/std/iter/trait.Iterator.html#method.filter" :sig "`TODO`"}
"Elixir@filter" {:lang "Elixir" :algo "filter" :lib "Enum" :id 3 :doc "https://hexdocs.pm/elixir/Enum.html#filter/2" :sig "`TODO`"}
"D@cartesianProduct" {:lang "D" :algo "cartesianProduct" :lib "std.algorithm.setops" :id 100 :doc "https://dlang.org/library/std/algorithm/setops/cartesian_product.html" :sig "`TODO`"}
"D@dotProduct" {:lang "D" :algo "dotProduct" :lib "std.numeric" :id 7 :doc "https://dlang.org/library/std/numeric/dot_product.html" :sig "`TODO`"}
"C++@cartesian_product" {:lang "C++" :algo "cartesian_product" :lib "range-v3" :id 100 :doc "https://ericniebler.github.io/range-v3/index.html#tutorial-views" :sig "`TODO`"}
"Python@product" {:lang "Python" :algo "product" :lib "itertools" :id 100 :doc "" :sig "`TODO`"}
"q@cross" {:lang "q" :algo "cross" :lib "-" :id 100 :doc "https://code.kx.com/q4m3/A_Built-in_Functions/#a18-cross" :sig "`TODO`"}
"J@. (Matrix Product)" {:lang "J" :algo ". (Matrix Product)" :lib "-" :id 7 :doc "https://code.jsoftware.com/wiki/Vocabulary/dot#dyadic" :sig "`TODO`"}
"R@outer" {:lang "R" :algo "outer" :lib "-" :id 6 :doc "https://www.rdocumentation.org/packages/base/versions/3.6.2/topics/outer" :sig "`TODO`"}
"Ruby@product" {:lang "Ruby" :algo "product" :lib "Array" :id 100 :doc "https://apidock.com/ruby/Array/product" :sig "`TODO`"}
"Racket@cartesian-product" {:lang "Racket" :algo "cartesian-product" :lib "base" :id 100 :doc "https://docs.racket-lang.org/reference/pairs.html#%28def._%28%28lib._racket%2Flist..rkt%29._cartesian-product%29%29" :sig "`TODO`"}
"Rust@cartesian_product" {:lang "Rust" :algo "cartesian_product" :lib "trait.itertools" :id 100 :doc "https://docs.rs/itertools/0.8.2/itertools/trait.Itertools.html#method.cartesian_product" :sig "`TODO`"}
"C++@all_of" {:lang "C++" :algo "all_of" :lib "<algorithm>" :id 31 :doc "https://en.cppreference.com/w/cpp/algorithm/all_any_none_of" :sig "`TODO`"}
"Haskell@all" {:lang "Haskell" :algo "all" :lib "Prelude" :id 31 :doc "https://hackage.haskell.org/package/base-4.14.0.0/docs/GHC-List.html#v:all" :sig "`TODO`"}
"Clojure@every?" {:lang "Clojure" :algo "every?" :lib "core" :id 31 :doc "https://clojuredocs.org/clojure.core/every_q" :sig "`TODO`"}
"Kotlin@all" {:lang "Kotlin" :algo "all" :lib "sequences" :id 31 :doc "https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.sequences/all.html" :sig "`TODO`"}
"Rust@all" {:lang "Rust" :algo "all" :lib "iter" :id 31 :doc "https://doc.rust-lang.org/std/iter/trait.Iterator.html#method.all" :sig "`TODO`"}
"Scala@forall" {:lang "Scala" :algo "forall" :lib "various" :id 31 :doc "https://doc.rust-lang.org/std/iter/trait.Iterator.html#method.all" :sig "`TODO`"}
"Elixir@all?" {:lang "Elixir" :algo "all?" :lib "Enum" :id 31 :doc "https://hexdocs.pm/elixir/Enum.html#all?/2" :sig "`TODO`"}
"Python@all" {:lang "Python" :algo "all" :lib "builtin" :id 31 :doc "https://docs.python.org/3/library/functions.html#all" :sig "`TODO`"}
"Ruby@all" {:lang "Ruby" :algo "all" :lib "Enumerable" :id 31 :doc "https://apidock.com/ruby/Enumerable/all%3F" :sig "`TODO`"}
"Java@allMatch" {:lang "Java" :algo "allMatch" :lib "Streams" :id 31 :doc "https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html#allMatch-java.util.function.Predicate-" :sig "`TODO`"}
"D@all" {:lang "D" :algo "all" :lib "std.algorithm" :id 31 :doc "https://dlang.org/library/std/algorithm/searching/all.all.html" :sig "`TODO`"}
"Swift@allSatisfy" {:lang "Swift" :algo "allSatisfy" :lib "" :id 31 :doc "https://developer.apple.com/documentation/swift/array/2994715-allsatisfy" :sig "`TODO`"}
"OCaml@for_all" {:lang "OCaml" :algo "for_all" :lib "List" :id 31 :doc "https://caml.inria.fr/pub/docs/manual-ocaml/libref/List.html" :sig "`TODO`"}
"C#@All" {:lang "C#" :algo "All" :lib "Linq" :id 31 :doc "https://docs.microsoft.com/en-us/dotnet/api/system.linq.enumerable.all?view=netcore-3.1" :sig "`TODO`"}
"JavaScript@every" {:lang "JavaScript" :algo "every" :lib "" :id 31 :doc "https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/every" :sig "`TODO`"}
"Elm@all" {:lang "Elm" :algo "all" :lib "List" :id 31 :doc "https://package.elm-lang.org/packages/elm/core/latest/List#all" :sig "`TODO`"}
"Julia@all" {:lang "Julia" :algo "all" :lib "Base" :id 31 :doc "https://docs.julialang.org/en/v1/base/collections/#Base.all-Tuple{AbstractArray,Any}" :sig "`TODO`"}
"Haskell@++" {:lang "Haskell" :algo "++" :lib "Prelude" :id 42 :doc "https://hackage.haskell.org/package/base-4.14.0.0/docs/Prelude.html#v:-43--43-" :sig "`TODO`"}
"Racket@append" {:lang "Racket" :algo "append" :lib "base" :id 42 :doc "https://docs.racket-lang.org/reference/pairs.html#%28def._%28%28quote._~23~25kernel%29._append%29%29" :sig "`TODO`"}
"Python@+" {:lang "Python" :algo "+" :lib "List" :id 42 :doc "https://docs.python.org/3/tutorial/introduction.html#lists" :sig "`TODO`"}
"Clojure@concat" {:lang "Clojure" :algo "concat" :lib "List" :id 42 :doc "https://clojuredocs.org/clojure.core/concat" :sig "`TODO`"}
"C++@join" {:lang "C++" :algo "join" :lib "Ranges" :id 42 :doc "https://en.cppreference.com/w/cpp/ranges" :sig "`TODO`"}
"Swift@+" {:lang "Swift" :algo "+" :lib "Array" :id 42 :doc "https://developer.apple.com/documentation/swift/array/2963457" :sig "`TODO`"}
"Rust@chain" {:lang "Rust" :algo "chain" :lib "iter" :id 42 :doc "https://doc.rust-lang.org/std/iter/trait.Iterator.html#method.chain" :sig "`TODO`"}
"Python@chain" {:lang "Python" :algo "chain" :lib "itertools" :id 42 :doc "https://docs.python.org/3/library/itertools.html#itertools.chain" :sig "`TODO`"}
"Julia@vcat" {:lang "Julia" :algo "vcat" :lib "Base" :id 42 :doc "https://docs.julialang.org/en/v1/base/arrays/#Base.vcat" :sig "`TODO`"}
"Elixir@concat" {:lang "Elixir" :algo "concat" :lib "Enum" :id 42 :doc "https://hexdocs.pm/elixir/Enum.html#concat/2" :sig "`TODO`"}
"Elixir@++" {:lang "Elixir" :algo "++" :lib "Kernel" :id 42 :doc "https://hexdocs.pm/elixir/Kernel.html#++/2" :sig "`TODO`"}
"F#@allPairs" {:lang "F#" :algo "allPairs" :lib "List" :id 100 :doc "https://fsharp.github.io/fsharp-core-docs/reference/fsharp-collections-listmodule.html#allPairs" :sig "`TODO`"}
"Julia@product" {:lang "Julia" :algo "product" :lib "IterTools" :id 100 :doc "https://juliacollections.github.io/IterTools.jl/v0.2.1/#product(xs...)-1" :sig "`TODO`"}
"APL@,∘.," {:lang "APL" :algo ",∘.," :lib "" :id 100 :doc "" :sig "`TODO`"}
"SQL@CROSS JOIN" {:lang "SQL" :algo "CROSS JOIN" :lib "" :id 100 :doc "https://www.w3resource.com/sql/joins/cross-join.php" :sig "`TODO`"}
"Python@all_equal" {:lang "Python" :algo "all_equal" :lib "more-itertools" :id 51 :doc "https://more-itertools.readthedocs.io/en/stable/api.html#more_itertools.all_equal" :sig "`TODO`"}
"Clojure@apply = " {:lang "Clojure" :algo "apply = " :lib "" :id 51 :doc "" :sig "`TODO`"}
"Racket@apply = " {:lang "Racket" :algo "apply = " :lib "" :id 51 :doc "" :sig "`TODO`"}
"Haskell@allEqual" {:lang "Haskell" :algo "allEqual" :lib "Data.List.HT" :id 51 :doc "https://hackage.haskell.org/package/utility-ht-0.0.15/docs/Data-List-HT.html#v:allEqual" :sig "`TODO`"}
"Javascript@allEqual" {:lang "Javascript" :algo "allEqual" :lib "bbo" :id 51 :doc "https://tnfe.github.io/bbo/#allequal" :sig "`TODO`"}
"C++@rotate" {:lang "C++" :algo "rotate" :lib "<algorithm>" :id 4104 :doc "https://en.cppreference.com/w/cpp/algorithm/rotate" :sig "`TODO`"}
"APL@⌽ (rotate)" {:lang "APL" :algo "⌽ (rotate)" :lib "" :id 4104 :doc "https://microapl.com/apl_help/ch_020_020_520.htm" :sig "`TODO`"}
"Ruby@rotate" {:lang "Ruby" :algo "rotate" :lib "Array" :id 4104 :doc "https://apidock.com/ruby/v2_5_5/Array/rotate" :sig "`TODO`"}
"Rust@rotate_left" {:lang "Rust" :algo "rotate_left" :lib "Slice" :id 4104 :doc "https://doc.rust-lang.org/stable/std/primitive.slice.html#method.rotate_left" :sig "`TODO`"}
"Julia@circshift" {:lang "Julia" :algo "circshift" :lib "" :id 4104 :doc "https://docs.julialang.org/en/v1/base/arrays/#Base.circshift" :sig "`TODO`"}
"q@rotate" {:lang "q" :algo "rotate" :lib "Core" :id 4104 :doc "https://code.kx.com/q4m3/A_Built-in_Functions/#a79-rotate" :sig "`TODO`"}
"Rust@dedup" {:lang "Rust" :algo "dedup" :lib "itertools" :id 15 :doc "https://docs.rs/itertools/0.7.6/itertools/structs/struct.Dedup.html" :sig "`TODO`"}
"Racket@remove-duplicates" {:lang "Racket" :algo "remove-duplicates" :lib "" :id 15 :doc "https://docs.racket-lang.org/reference/pairs.html#%28def._%28%28lib._racket/list..rkt%29._remove-duplicates%29%29" :sig "`TODO`"}
"OCaml@sort_uniq" {:lang "OCaml" :algo "sort_uniq" :lib "List" :id 15 :doc "https://ocaml.org/api/List.html#VALsort_uniq" :sig "`TODO`"}
"Elm@dedup" {:lang "Elm" :algo "dedup" :lib "List" :id 14 :doc "https://package.elm-lang.org/packages/mgold/elm-nonempty-list/latest/List-Nonempty#dedup" :sig "`TODO`"}
"Elm@uniq" {:lang "Elm" :algo "uniq" :lib "List" :id 15 :doc "https://package.elm-lang.org/packages/mgold/elm-nonempty-list/latest/List-Nonempty#uniq" :sig "`TODO`"}
"F#@distinct" {:lang "F#" :algo "distinct" :lib "Seq" :id 15 :doc "https://fsharp.github.io/fsharp-core-docs/reference/fsharp-collections-seqmodule.html#distinct" :sig "`TODO`"}
"Pharo@removeDuplicates" {:lang "Pharo" :algo "removeDuplicates" :lib "OrderedCollection" :id 15 :doc "" :sig "`TODO`"}
"BQN@  (scan) " {:lang "BQN" :algo "  (scan) " :lib "-" :id 4 :doc "https://mlochbaum.github.io/BQN/help/scan.html" :sig "`TODO`"}
"BQN@˝ (insert)" {:lang "BQN" :algo "˝ (insert)" :lib "-" :id 1 :doc "https://mlochbaum.github.io/BQN/help/insert.html" :sig "`TODO`"}
"Kotlin@fold" {:lang "Kotlin" :algo "fold" :lib "collections" :id 1 :doc "https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/fold.html" :sig "`TODO`"}
"Kotlin@runningFold" {:lang "Kotlin" :algo "runningFold" :lib "collections" :id 4 :doc "https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/running-fold.html" :sig "`TODO`"}
"D@fold" {:lang "D" :algo "fold" :lib "algorithm.iteration" :id 1 :doc "https://dlang.org/library/std/algorithm/iteration/fold.html" :sig "`TODO`"}
"Scala@fold" {:lang "Scala" :algo "fold" :lib "various" :id 1 :doc "https://www.scala-lang.org/api/2.12.8/scala/collection/immutable/Vector.html#fold[A1%3E:A](z:A1)(op:(A1,A1)=%3EA1):A1" :sig "`TODO`"}
"Scala@reduce" {:lang "Scala" :algo "reduce" :lib "various" :id 1 :doc "https://www.scala-lang.org/api/2.12.8/scala/collection/immutable/Vector.html#reduce[A1%3E:A](op:(A1,A1)=%3EA1):A1" :sig "`TODO`"}
"Ruby@inject" {:lang "Ruby" :algo "inject" :lib "Enumerable" :id 1 :doc "https://apidock.com/ruby/Enumerable/inject" :sig "`TODO`"}
"Pharo@inject:into:" {:lang "Pharo" :algo "inject:into:" :lib "Collection" :id 1 :doc "" :sig "`TODO`"}
"Pharo@reduce:" {:lang "Pharo" :algo "reduce:" :lib "Collection" :id 1 :doc "" :sig "`TODO`"}
"Pharo@fold:" {:lang "Pharo" :algo "fold:" :lib "Collection" :id 1 :doc "" :sig "`TODO`"}
"BQN@´ (fold)" {:lang "BQN" :algo "´ (fold)" :lib "" :id 1 :doc "https://mlochbaum.github.io/BQN/help/fold.html" :sig "`TODO`"}
"APL@⌿ (reduce first)" {:lang "APL" :algo "⌿ (reduce first)" :lib "" :id 1 :doc "https://microapl.com/apl_help/ch_020_020_810.htm" :sig "`TODO`"}
"BQN@⌜ (table)" {:lang "BQN" :algo "⌜ (table)" :lib "" :id 6 :doc "https://mlochbaum.github.io/BQN/help/table.html" :sig "`TODO`"}
"J@/ (table)" {:lang "J" :algo "/ (table)" :lib "" :id 6 :doc "https://code.jsoftware.com/wiki/Vocabulary/slash#dyadic" :sig "`TODO`"}
"Rust@counts" {:lang "Rust" :algo "counts" :lib "Itertools" :id 19 :doc "https://docs.rs/itertools/latest/itertools/trait.Itertools.html#method.counts" :sig "`TODO`"}
"C++@adjacent_transform" {:lang "C++" :algo "adjacent_transform" :lib "<ranges>" :id 5 :doc "https://en.cppreference.com/w/cpp/ranges/adjacent_transform_view" :sig "`TODO`"}
"Gleam@map" {:lang "Gleam" :algo "map" :lib "list" :id 2 :doc "https://hexdocs.pm/gleam_stdlib/0.8.0/gleam/list/#map" :sig "`TODO`"}
})
