import models.Node2

// Right answer
class LinkedList2 {
  def isLoop(node2: Node2): Boolean = {
    var result: Boolean = false

    var tortoise: Node2 = node2
    var hare: Node2 = node2

    while(!result && hare != null){
      tortoise = tortoise.nextNode
      if(hare.nextNode != null) hare = hare.nextNode.nextNode

      if(tortoise == hare) result = true
    }

    result
  }
}