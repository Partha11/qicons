package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ArrowTrendingDown: ImageVector
    get() {
        if (_ArrowTrendingDown != null) {
            return _ArrowTrendingDown!!
        }
        _ArrowTrendingDown = ImageVector.Builder(
            name = "Outlined.ArrowTrendingDown",
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
                moveTo(2.25f, 6f)
                lineTo(9f, 12.75f)
                lineToRelative(4.286f, -4.286f)
                arcToRelative(11.948f, 11.948f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.306f, 6.43f)
                lineToRelative(0.776f, 2.898f)
                moveToRelative(0f, 0f)
                lineToRelative(3.182f, -5.511f)
                moveToRelative(-3.182f, 5.51f)
                lineToRelative(-5.511f, -3.181f)
            }
        }.build()

        return _ArrowTrendingDown!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowTrendingDown: ImageVector? = null
