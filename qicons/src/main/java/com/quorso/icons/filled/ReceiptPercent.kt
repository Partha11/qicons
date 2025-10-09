package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.ReceiptPercent: ImageVector
    get() {
        if (_ReceiptPercent != null) {
            return _ReceiptPercent!!
        }
        _ReceiptPercent = ImageVector.Builder(
            name = "Filled.ReceiptPercent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 1.5f)
                curveToRelative(-1.921f, 0f, -3.816f, 0.111f, -5.68f, 0.327f)
                curveToRelative(-1.497f, 0.174f, -2.57f, 1.46f, -2.57f, 2.93f)
                lineTo(3.75f, 21.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.029f, 0.696f)
                lineToRelative(3.471f, -1.388f)
                lineToRelative(3.472f, 1.388f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.556f, 0f)
                lineToRelative(3.472f, -1.388f)
                lineToRelative(3.471f, 1.388f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.029f, -0.696f)
                lineTo(20.25f, 4.757f)
                curveToRelative(0f, -1.47f, -1.073f, -2.756f, -2.57f, -2.93f)
                arcTo(49.255f, 49.255f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 1.5f)
                close()
                moveTo(15.53f, 8.78f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.06f, -1.06f)
                lineToRelative(-6f, 6f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.06f, 1.06f)
                lineToRelative(6f, -6f)
                close()
                moveTo(8.625f, 9f)
                arcToRelative(1.125f, 1.125f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.25f, 0f)
                arcToRelative(1.125f, 1.125f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.25f, 0f)
                close()
                moveTo(14.25f, 12.375f)
                arcToRelative(1.125f, 1.125f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2.25f)
                arcToRelative(1.125f, 1.125f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2.25f)
                close()
            }
        }.build()

        return _ReceiptPercent!!
    }

@Suppress("ObjectPropertyName")
private var _ReceiptPercent: ImageVector? = null
