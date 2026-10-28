Spring Data JPA - Custom Finder Method (CFM) Keywords

And - Both conditions
findByNameAndCost ()

Or - Either condition
findByNameOrCost ()

LessThan - Less than a value
findByCostLessThan ()

LessThanEqual - Less than or equal
findByCostLessThanEqual ()

GreaterThan - Greater than a value
findByCostGreaterThan ()

Between - Between two values
findByCostBetween ()

Containing - Contains text
findByNameContaining ()

StartingWith - Starts with text
findByNameStartingWith ()

EndingWith - Ends with text
findByNameEndingWith ()

Like - Pattern matching
findByNameLike ()

IgnoreCase - Ignores case
findByNameIgnoreCase ()

IsNull - Checks for null
findByNameIsNull ()

IsNotNull - Checks for non-null
findByNameIsNotNull ()

In - Matches values in a collection
findByCostIn ()

NotIn - Excludes values in a collection
findByCostNotIn ()

True - Boolean value is true
findByActiveTrue ()

False - Boolean value is false
findByActiveFalse ()

OrderBy - Sorts results
findByNameOrderByCostAsc ()

Distinct - Returns distinct results
findDistinctByName ()

Top / First - Limits results
findTop3ByOrderByCostDesc ()

CountBy - Counts matching records
countByCostGreaterThan ()

ExistsBy - Checks whether a record exists
existsByName ()

DeleteBy - Deletes matching records
deleteByName ()

Definition:
A Custom Finder Method is a repository method that follows Spring Data JPA naming conventions to generate queries
automatically.