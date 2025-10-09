package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.MagnifyingGlassCircle: ImageVector
    get() {
        if (_MagnifyingGlassCircle != null) {
            return _MagnifyingGlassCircle!!
        }
        _MagnifyingGlassCircle = ImageVector.Builder(
            name = "Outlined.MagnifyingGlassCircle",
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
                moveToRelative(15.75f, 15.75f)
                lineToRelative(-2.489f, -2.489f)
                moveToRelative(0f, 0f)
                arcToRelative(3.375f, 3.375f, 0f, isMoreThanHalf = true, isPositiveArc = false, -4.773f, -4.773f)
                arcToRelative(3.375f, 3.375f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.774f, 4.774f)
                close()
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -18f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 0f)
                close()
            }
        }.build()

        return _MagnifyingGlassCircle!!
    }

@Suppress("ObjectPropertyName")
private var _MagnifyingGlassCircle: ImageVector? = null
