def readProperties(propertiesFile) {
	 def props = readProperties interpolate: true, file: propertiesFile
	 props.each {
		println ( it.key + " = " + it.value )
	 }

     return props
}