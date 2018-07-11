import java.awt.Dimension
import java.awt.Toolkit


Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize()
Integer screenHeight = screenSize.height
Integer screenWidth = screenSize.width
println screenWidth + 'x' + screenHeight