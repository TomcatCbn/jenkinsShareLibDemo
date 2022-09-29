def readProperties(propertiesFile) {
	 def props = readProperties interpolate: true, file: properties_file
	 props.each {
		println ( it.key + " = " + it.value )
	 }

     return props
}