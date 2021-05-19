package classwork_adapter_pattern

object Adapters {

  implicit class getPricableFromCostable(costable: Costable) extends Pricable {
    override def price(): Int = costable.cost()
  }

}