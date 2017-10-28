import models.Node

class LinkedList {
  def isLoop(root: Node): Boolean = {
    var flag: Boolean = true
    var result: Boolean = true

    var turtle: Node = root
    var rabbit: Node = root

    while(flag){
      if(turtle == null || rabbit == null){
        result = false
        flag = false
      } else if(turtle == rabbit) {
        result = true
        flag = false
      } else {
        turtle = turtle.next
        rabbit = rabbit.next.next
      }
    }

    result
  }
}