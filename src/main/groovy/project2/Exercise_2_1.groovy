package project2

def maximum(myList) {
    def indexMap = [:]

    myList.eachWithIndex { value, index ->
        indexMap[value] == null ? indexMap[value] = [] << index : indexMap[value] << index
    }

    maxValue = indexMap.keySet().max()
    return [maxValue, indexMap[maxValue]]
}

(maxVal, indList) = maximum([5, 3, 5, 5, 1, 5])
println "Maximum: $maxVal"
println "Indexes: $indList"

(maxVal, indList) = maximum(['a', 'c', 'c', 'c', 'b'])
println "Maximum: $maxVal"
println "Indexes: $indList"
