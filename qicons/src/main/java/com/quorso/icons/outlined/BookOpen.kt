package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.BookOpen: ImageVector
    get() {
        if (_BookOpen != null) {
            return _BookOpen!!
        }
        _BookOpen = ImageVector.Builder(
            name = "Outlined.BookOpen",
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
                moveTo(12f, 6.042f)
                arcTo(8.967f, 8.967f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 3.75f)
                curveToRelative(-1.052f, 0f, -2.062f, 0.18f, -3f, 0.512f)
                verticalLineToRelative(14.25f)
                arcTo(8.987f, 8.987f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 18f)
                curveToRelative(2.305f, 0f, 4.408f, 0.867f, 6f, 2.292f)
                moveToRelative(0f, -14.25f)
                arcToRelative(8.966f, 8.966f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, -2.292f)
                curveToRelative(1.052f, 0f, 2.062f, 0.18f, 3f, 0.512f)
                verticalLineToRelative(14.25f)
                arcTo(8.987f, 8.987f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 18f)
                arcToRelative(8.967f, 8.967f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, 2.292f)
                moveToRelative(0f, -14.25f)
                verticalLineToRelative(14.25f)
            }
        }.build()

        return _BookOpen!!
    }

@Suppress("ObjectPropertyName")
private var _BookOpen: ImageVector? = null
