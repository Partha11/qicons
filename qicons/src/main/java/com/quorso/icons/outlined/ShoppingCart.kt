package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ShoppingCart: ImageVector
    get() {
        if (_ShoppingCart != null) {
            return _ShoppingCart!!
        }
        _ShoppingCart = ImageVector.Builder(
            name = "Outlined.ShoppingCart",
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
                moveTo(2.25f, 3f)
                horizontalLineToRelative(1.386f)
                curveToRelative(0.51f, 0f, 0.955f, 0.343f, 1.087f, 0.835f)
                lineToRelative(0.383f, 1.437f)
                moveTo(7.5f, 14.25f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                horizontalLineToRelative(15.75f)
                moveToRelative(-12.75f, -3f)
                horizontalLineToRelative(11.218f)
                curveToRelative(1.121f, -2.3f, 2.1f, -4.684f, 2.924f, -7.138f)
                arcToRelative(60.114f, 60.114f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16.536f, -1.84f)
                moveTo(7.5f, 14.25f)
                lineTo(5.106f, 5.272f)
                moveTo(6f, 20.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 0f)
                close()
                moveTo(18.75f, 20.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 0f)
                close()
            }
        }.build()

        return _ShoppingCart!!
    }

@Suppress("ObjectPropertyName")
private var _ShoppingCart: ImageVector? = null
