package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ShoppingBag: ImageVector
    get() {
        if (_ShoppingBag != null) {
            return _ShoppingBag!!
        }
        _ShoppingBag = ImageVector.Builder(
            name = "Outlined.ShoppingBag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.75f, 10.5f)
                lineTo(15.75f, 6f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -7.5f, 0f)
                verticalLineToRelative(4.5f)
                moveToRelative(11.356f, -1.993f)
                lineToRelative(1.263f, 12f)
                curveToRelative(0.07f, 0.665f, -0.45f, 1.243f, -1.119f, 1.243f)
                lineTo(4.25f, 21.75f)
                arcToRelative(1.125f, 1.125f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.12f, -1.243f)
                lineToRelative(1.264f, -12f)
                arcTo(1.125f, 1.125f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.513f, 7.5f)
                horizontalLineToRelative(12.974f)
                curveToRelative(0.576f, 0f, 1.059f, 0.435f, 1.119f, 1.007f)
                close()
                moveTo(8.625f, 10.5f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.75f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0f)
                close()
                moveTo(16.125f, 10.5f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.75f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0f)
                close()
            }
        }.build()

        return _ShoppingBag!!
    }

@Suppress("ObjectPropertyName")
private var _ShoppingBag: ImageVector? = null
