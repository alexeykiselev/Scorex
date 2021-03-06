package scorex.transaction

import com.google.common.primitives.Longs

case class FeesStateChange(fee: Long) extends StateChangeReason with Serializable {
  override def bytes: Array[Byte] = Longs.toByteArray(fee)

  override val signature: Array[Byte] = Array.empty
}