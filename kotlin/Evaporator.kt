fun evaporator(content: Double, evap_per_day: Double, threshold: Double): Int {
    val contentThreshold = content * (threshold/100)
    var currentContent = content
    var days = 0
    while (currentContent >= contentThreshold) {
        currentContent -= currentContent * (evap_per_day/100)
        days++
    }
    return days
}