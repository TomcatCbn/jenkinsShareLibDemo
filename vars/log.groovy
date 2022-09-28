//带颜色打印信息
def call(value, color = 'green') {
    colors = ['red'  : "\033[40;31m >>>>>>>>>>>${value}<<<<<<<<<<< \033[0m",
              'blue' : "\033[47;34m ${value} \033[0m",
              'green': "\033[40;32m >>>>>>>>>>>${value}<<<<<<<<<<< \033[0m"]
    ansiColor('xterm') {
        println(colors[color])
    }
}
